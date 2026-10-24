/*
 * Write a program that reads a positive integer N (maximum = 10)
 * and then reads N integers, storing them in an array.
 * Next, display on the screen all the negative numbers that were read.
 */

import java.util.Scanner;

public class ex023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= 10) {
            int[] numbers = new int[n];

            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter a number: ");
                numbers[i] = sc.nextInt();
            }

            System.out.println("NEGATIVE NUMBERS:");
            for (int number : numbers) {
                if (number < 0) {
                    System.out.println(number);
                }
            }
        } else {
            System.out.println("N must be between 1 and 10.");
        }

        sc.close();
    }
}
