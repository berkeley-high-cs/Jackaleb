
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("\n\nLet's play 20 questions. Choose an animal and I will try to guess it!");
    Scanner scan = new Scanner(System.in);

    System.out.println("Is it a mammal (y/n)?");
    String answer = scan.nextLine();
    if (answer.equals("y")) {
      System.out.println("Is it a pet (y/n)?");
      answer = scan.nextLine();
      if (answer.equals("y")) {
        System.out.println("Is it a big pet? (y/n)");
        answer = scan.nextLine();
        if (answer.equals("y")) {
          System.out.println("Is it dog-like? (y/n)");
          answer = scan.nextLine();
          if (answer.equals("y")) {
            System.out.println("I guess an dog! Click on run to play again.");
          } else
            System.out.println("I guess an cat! Click on run to play again.");
        } else
          System.out.println("I guess a fish! Click on run to play again.");
      } else
        System.out.println("I guess a feral beast! Click on run to play again.");

    } else { // not a mammal
      System.out.println("Is it a reptile? (y/n)");
      answer = scan.nextLine();
        if (answer.equals("y")){
          System.out.println("Is it a big reptile? (y/n)");
          answer = scan.nextLine();
        if (answer.equals("y")){
          System.out.println("Komodo Dragon ig");
        }
        
          else
          System.out.println("snake idk");
        } 
       else
          System.out.println("Is it a bird type creature? (y/n)");
           answer = scan.nextLine();
        if (answer.equals("y")){
        System.out.println("Does it live in the cold? (y/n)");
          answer = scan.nextLine();
        if (answer.equals("y")){
        System.out.println("its a penguin :)");
        }
          else
          System.out.println("its uhhhh..... NOT a penguin");
        }
              else
             System.out.println(">:(");
    }
  }

}
