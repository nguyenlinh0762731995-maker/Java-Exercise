/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

import java.util.Random;
import java.util.Scanner;

/*
 * Exercise 12 - Random Addition Game
 *
 * Use Random to create each question with a random number
 * of terms from 2 to 5.
 * Each term is an integer from 1 to 10.
 * Print the addition question and ask the user to enter the answer.
 * Check whether the answer is correct or incorrect.
 * Each correct answer gives 1 point.
 * The program ends when the user answers 3 questions incorrectly.
 * Use nested loops:
 * - The outer loop controls the number of incorrect answers.
 * - The inner loop generates the terms of each addition question.
 * At the end, print the total score.
 */
public class RandomAdditionGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int term;
        int totalterms;
        int score = 0;
        int sum = 0;
        int res = 0;
        int wrong = 0;
        do {
            totalterms = rand.nextInt(5 - 2 + 1) + 2;
            sum = 0;
            for (int j = 1; j <= totalterms; j++) {
                term = rand.nextInt(10) + 1;
                sum += term;
                if (j == totalterms) {
                    System.out.print(term + " = ");
                } else {
                    System.out.print(term + " + ");
                }
            }
            res = sc.nextInt();
            if (res == sum) {
                score++;
            } else {
                wrong++;
            }
        } while (wrong < 3);
        System.out.println("Total score:  " + score);
    }
}
