public class ArraysStringsCC {

  /*
   * Returns true if its argument is a single-character string and a vowel.
   */
  public boolean isVowel(String s) {
    return s.length() == 1 && "aeiou".indexOf(s.toLowerCase()) != -1;
  }

  /*
   * Returns true if its argument is a prime number.
   */
  public boolean isPrime(int n) {
    for (int d = 2; d <= Math.sqrt(n); d++) {
      if (n % d == 0) return false;
    }
    return n > 1;
  }

public int countPrimes(int [] array){
 int count = 0;
 for(int i = 0; i < array.length; i++){
    if(isPrime(array[i])){
      count++;
      }
    }
    return count++;
  }

  public int countVowels(String r){
    int count = 0;
    for(int i = 0; i< r.length(); i++){
      if(isVowel(r.substring(i, i + 1))){
        count++;
      }
    }
    return count;
  }

  public int indexOfVowel(String r2){
    for(int i = 0; i < r2.length(); i++){
      if(isVowel(r2.substring(i, i + 1))){
        return i;
      }
    }
    return -1;
  }

}
