package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

/*
 * Exercise 01: Triangle Area Comparison
 *
 * Problem:
 * Create a Triangle class with three sides (a, b, c) and a method to calculate
 * its area using Heron's formula. Then create a program that:
 * 1. Reads measurements for two triangles (X and Y)
 * 2. Calculates the area of each triangle
 * 3. Displays both areas
 * 4. Compares and displays which triangle has the larger area
 *
 * Heron's Formula: area = sqrt(s * (s-a) * (s-b) * (s-c))
 * where s = (a + b + c) / 2
 */

public class Ex01_TriangleAreaComparison {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x;
        Triangle y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // area
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X Area = %.4f%n", areaX);
        System.out.printf("Triangle Y Area = %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Largest triangle area is Triangle X");
        } else {
            System.out.println("Largest triangle area is Triangle Y");
        }

        sc.close();
    }
}
