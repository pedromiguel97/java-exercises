/*
 * Write a program that reads any value and prints a message stating which of
 * the following intervals ([0,25], (25,50], (50,75], (75,100]) the value
 * belongs to. Obviously, if the value is not within any of these intervals,
 * the message "Out of range" must be printed.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        if (x > 0 && x <= 25) {
            System.out.println("INTERVAL (0, 25)");
        }

        else if (x > 25 && x <= 50) {
            System.out.println("INTERVAL (25, 50)");
        }

        else if (x > 50 && x <= 75) {
            System.out.println("INTERVAL (50, 75)");
        }

        else if (x > 75 && x <= 100) {
            System.out.println("INTERVAL (75, 100)");
        }

        else {
            System.out.println("Out of Range");
        }

    }
}
