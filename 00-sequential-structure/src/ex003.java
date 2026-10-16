/*
 * Write a program that reads four integer values A, B, C and D.
 * Then, calculate and display the difference between the product
 * of A and B and the product of C and D, according to the formula:
 *
 * DIFFERENCE = (A * B - C * D)
 */

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {

        // scanner: input data function
        Scanner sc = new Scanner(System.in);

        // vars init
        int a, b, c, d, diff;

        // var scanner
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diff = (a * b - c * d);
        System.out.println("DIFFERENCE = " + diff);
    }
}
