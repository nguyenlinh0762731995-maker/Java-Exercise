package Exercise;

import java.util.Scanner;

/*
 * Exercise 7 - Sentinel Statistics
 *
 * Continuously enter real numbers; enter 0 to stop.
 * Do not include the sentinel value 0 in the data.
 * Calculate:
 * - The sum of all entered numbers.
 * - The number of entered numbers.
 * - The average of the entered numbers.
 * If the user enters 0 at the beginning,
 * print a message indicating that there is no data.
 */
public class SentinelStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real number (0 to quit): ");
        double number = sc.nextDouble();
        double sum = 0D;
        int count = 0;
        while (number != 0) {
            count++;
            sum += number;
            System.out.print("Enter real number (0 to quit): ");
            number = sc.nextDouble();

        }
        if (count == 0) {
            System.out.println("No data !");
        } else {
            double average = sum / count;
            System.out.println("Sum = " + sum);
            System.out.println("Count = " + count);
            System.out.println("Average = " + average);
        }

    }
}
