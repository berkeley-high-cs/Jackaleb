import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Xor {


  // This is the cipher text, encoded as a hex string. If you translate every
  // two characters of this string into a byte you will have an array of bytes
  // which can be decoded by xor'ing the bytes with bits from the key, taking
  // first the 8 least significant bits of the key for the 0th byte, the the
  // next 8, and so on, looping back around to the least significant bits every
  // four bytes.
  private static final String CIPHERTEXT =
    "452dbb017333a6456328a64f6064a6522722ba4f26";

  // This is the key. It is just a random int, so 32 random bits. It was used to
  // encode my secret message converted (after being converted to bytes with
  // msg.getBytes(StandardCharsets.UTF_8) as described above. (Encryption and
  // decryption are the same process with this cipher.)
  private static final int KEY = 567231495;
  public ArrayList<Byte> byteHolder = new ArrayList<>();
  public byte[] byteArray = new byte[CIPHERTEXT.length()/2];

  // You don't need to change main but you do need to implement the decode
  // method. And you'll probably want to implement some helper methods along the
  // way. To make a String from an array of bytes (byte[]) you can use the
  // String constructor String(byte[] bytes, String enc) like:
  //
  //   new String(bytes, StandardCharsets.UTF_8);
  //

  public String decode(String text , int initKey){
    int n = 0;
    for(int i = 0; i < text.length(); i+=2){
     byteArray[n] = ((byte)Integer.parseInt(text.substring(i, i + 2),16));
    n++;
    }

  byte baklava = (byte)(byteArray[0] ^ initKey);
  byte baklava2 = (byte)(byteArray[1] ^ initKey << 24);
byte[] test = new byte[2];
 test[0] = baklava;
 test[1] = baklava2;
 //return (CIPHERTEXT.length() / 2);
  return new String(test, StandardCharsets.UTF_8);
  }
  public static void main(String[] argv) throws Exception {
    System.out.println(new Xor().decode(CIPHERTEXT, KEY));
  }
}
