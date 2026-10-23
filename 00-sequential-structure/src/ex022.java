/*
 * Write a program that reads an integer N and the heights of N people.
 * Store the N heights in an array. Then, display the average height
 * of these people.
 *
 * Example input:
 *   3
 *   1.72
 *   1.56
 *   1.80
 *
 * Example output:
 *   AVERAGE HEIGHT = 1.69
 */

import java.util.Locale;
import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // number of records
        int n = sc.nextInt();

        // init vector
        double[] vect = new double[n];

        double total = 0;
        for (int i=0; i < n; i++) {
            vect[i] = sc.nextDouble();
            total += vect[i];
        }

        System.out.printf("AVERAGE HEIGHT: %.2f\n", total / n);

        sc.close();
    }
}
