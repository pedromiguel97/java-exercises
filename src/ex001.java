/*
 * Write a program that reads two integer values and then displays
 * their sum on the screen with an explanatory message.
 */

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {

        // scanner: input data function
        Scanner sc = new Scanner(System.in);

        // vars init
        int a, b, sum;

        // var scanner
        a = sc.nextInt();
        b = sc.nextInt();

        sum = a + b;
        System.out.println("SUM = " + sum);
    }
}
