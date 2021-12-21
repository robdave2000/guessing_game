import java.util.Scanner;
import java.util.Random;

/*

A number-guessing game.

*/

public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean correctGuess = false;
    int guess = 0;
    int increment = 0;

    System.out.println("Hello user. What is your name?");
    String name = input.nextLine();

    System.out.println("Welcome " + name + " I'm thinking of a number between 1 and 100.");

    Random rand = new Random();
    int number = rand.nextInt(100);

    System.out.println("Try to guess my number.");

    while (correctGuess == false)
    {
      increment++;
      
      try
      {
        guess = input.nextInt();
      }
      catch (Exception e)
      {
        String bad_input = input.next();   // need to progress past bad input
        System.out.println("That's not an integer, try again");
        continue;
      }

      if (guess > 100 || guess < 1)
      {
        System.out.println("You're guess out of range please try again");
      }
      else if (guess > number)
      {
        System.out.println("You're guess is to high, try again.");
      }
      else if (guess < number)
      {
        System.out.println("You're guess is to low, try again.");
      }
      else if (guess == number)
      {
        System.out.println("Well done, " + name + "! You found my number in " + increment + " tries!");

        correctGuess = true;
      }
    }
  }

}
