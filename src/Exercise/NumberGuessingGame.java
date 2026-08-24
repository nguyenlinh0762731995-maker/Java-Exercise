package Exercise;

import java.util.Random;
import java.util.Scanner;

/*
 * Exercise 10 - Number Guessing Game
 *
 * Use Random to generate a secret number from 1 to 20.
 * Ask the user to guess the number until the guess is correct.
 * After each incorrect guess:
 * - If the guess is smaller than the secret number,
 *   tell the user to guess higher.
 * - If the guess is greater than the secret number,
 *   tell the user to guess lower.
 * Use a do/while loop.
 * Count the number of guesses.
 * When the user guesses correctly, print the number of attempts.
 */
public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int nSecret = rand.nextInt(20) + 1;
        int count = 0;
        int n;
        do {
            System.out.print("Enter a number from 1 to 20 : ");
            n = sc.nextInt();
            count++;
            if (n > nSecret) {
                System.out.println("You guessed too hight !");
            } else if (n < nSecret) {
                System.out.println("You guessed too low ! ");
            } else {
                System.out.println("The secret number is " + nSecret);
            }
        } while (n != nSecret);
        System.out.println("You tried " + count + " times");
    }
}
