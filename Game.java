import java.util.Scanner;
import java.util.Random;


/** A number guessing game. */
public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");


    Scanner input = new Scanner(System.in);


    // Get user's name
    System.out.println("Enter your name:");
    String name = input.nextLine();
    // Test that everything works
    System.out.println(name +", I'm thinking of a number between 0 and 100");


    //Create an instance of the Random object
    Random rand = new Random();


    //Call method nextInt and pass in upper range (exclusive)
    int number = rand.nextInt(100); // 101 to be inclusive //bound is automatically created by VSCode
    System.out.println("Try to guess the number!");


    int guessCounter = 1;
   
    System.out.println("What is your guess?");
    int guess = input.nextInt();
   
    //int num = Integer.parseInt(str);


    while (guess != number) {
      guessCounter++;
      if (guess < number ) {
        System.out.println("That's too low, please try again:");      
        guess = input.nextInt();
      } else {
        System.out.println("That's too high, please try again:");      
        guess = input.nextInt();
      }
    }


    System.out.println("The number was " + number);
    System.out.println("It took you " + guessCounter + " times to guess this number");
  }
}
