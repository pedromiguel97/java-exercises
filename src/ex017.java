/*
 * Problem Statement:
 * Write a program that reads the coordinates (X, Y) of an indefinite number
 * of points in the Cartesian coordinate system. For each point, print the
 * quadrant it belongs to.
 * The program must end when at least one of the two coordinates is ZERO
 * (in this case, without printing any message).
 */

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {

        // scanner
        Scanner sc = new Scanner(System.in);

        // coordinates
        // q1 = (x > 0) && (y > 0)
        // q2 = (x < 0) && (y > 0)
        // q3 (x < 0) && (y < 0)
        // q4 = (x > 0) && (y < 0)

        // input
        int x = sc.nextInt();
        int y = sc.nextInt();

        // condition
        while ((x != 0) && (y != 0)) {

            if (x > 0 && y > 0) {
                System.out.println("Q1");
            }

            else if (x < 0 && y > 0) {
                System.out.println("Q2");
            }

            else if (x < 0 && y < 0) {
                System.out.println("Q3");
            }

            else if ((x > 0 && y < 0)) {
                System.out.println("Q4");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
