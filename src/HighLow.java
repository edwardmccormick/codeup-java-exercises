import util.Input;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static int generateNumber() {
        Random number = new Random();
        return number.nextInt(100);
    }


    public static void main(String[] args) {
        int number = generateNumber();
        int guesses = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to play a guessing game?");
        String response = in.nextLine();
        if (!(response.equalsIgnoreCase("yes") | response.equalsIgnoreCase("y"))) {
            System.out.println("Okay, see you next time.");
        } else if (response.equalsIgnoreCase("yes") | response.equalsIgnoreCase("y")) {
            System.out.println("Great! I've got a number between 1 and 100. Guess a number and I'll tell you whether you guess higher or lower. \n What's your first guess?");
            while (true) {
                int guess = in.nextInt();
                guesses++;
                if (number == guess) {
                    System.out.println("Hey! Good job! You got it! Thanks for playing, we'll see you again real soon!");
                    break;
                } else if (number > guess) {
                    System.out.println("You need to guess HIGHER!");
                } else if (number < guess) {
                    System.out.println("You need to guess LOWER!");
                } else {
                    System.out.println("Something went wrong. Oops!");
                    break;
                }
                System.out.println("What's your next guess? You've had " + guesses + " guesses so far.");
            }
        }


    }
}