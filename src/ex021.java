import java.util.Locale;
import java.util.Scanner;

/*
 * Exercise 021: Calculate weighted average of three values
 *
 * Problem statement:
 * Read the number of test cases (rounds).
 * For each test case, read three double values (v1, v2, v3).
 * Calculate the weighted average using weights 2.0, 3.0, and 5.0 respectively.
 * Formula: average = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0) / 10
 * Print the result with one decimal place for each case.
 *
 * Example:
 * Input:
 * 2
 * 6.5 4.3 9.2
 * 5.1 8.9 7.0
 *
 * Output:
 * 7.4
 * 7.0
 */
public class ex021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // scanner
        Scanner sc = new Scanner(System.in);

        // number of rounds
        int rounds = sc.nextInt();

        for (int c = 0; c < rounds; c++) {

            double v1 = sc.nextDouble();
            double v2 = sc.nextDouble();
            double v3 = sc.nextDouble();

            double average = ((v1 * 2.0) + (v2 * 3.0) + (v3 * 5.0)) / 10;

            System.out.printf("%.1f", average);
        }

        sc.close();
    }
}
