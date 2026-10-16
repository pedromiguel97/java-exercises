/*
 * Write a program that reads three double-precision floating-point
 * values: A, B and C. Then, calculate and display:
 *
 * a) the area of the right triangle that has A as its base and C as
 *    its height.
 * b) the area of the circle with radius C. (pi = 3.14159)
 * c) the area of the trapezoid that has A and B as its bases and C
 *    as its height.
 * d) the area of the square with side B.
 * e) the area of the rectangle with sides A and B.
 */

import java.util.Scanner;
import java.util.Locale;

public class ex006 {
    public static void main(String[] args) {

        // set locale
        // always before scanner
        Locale.setDefault(Locale.US);

        // scanner
        Scanner sc = new Scanner(System.in);

        // input vars
        double A,  B, C;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // A) AREA = A * C / 2.0
        double triangle = A * C / 2.0;

        // B) AREA = A * C / 2.0
        double circle = pi * C * C;

        // C) AREA = A * C / 2.0
        double trapezoid = (A + B) / 2.0 * C;

        // D) AREA = A * C / 2.0
        double square = B * B;

        // E) AREA = A * C / 2.0
        double rectangle = A * B;

        System.out.printf("TRIANGLE: %.3f\n", triangle);
        System.out.printf("CIRCLE: %.3f\n", circle);
        System.out.printf("TRAPEZOID: %.3f\n", trapezoid);
        System.out.printf("SQUARE: %.3f\n", square);
        System.out.printf("RECTANGLE: %.3f\n", rectangle);
    }
}
