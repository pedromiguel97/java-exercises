/*
 * Write a program that reads the radius of a circle and then displays
 * the area of this circle with four decimal places, as shown in the
 * examples.
 *
 * Area formula: area = π * radius²
 *
 * Consider π = 3.14159
 */

import java.util.Locale;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {

        // set locale
        Locale.setDefault(Locale.US);

        // scanner: input data function
        Scanner sc = new Scanner(System.in);

        // vars init
        double area, radius, pi = 3.14159;

        radius = sc.nextDouble();

        area = Math.pow(radius, 2) * pi;

        System.out.printf("AREA = %.4f%n", area);
    }
}

