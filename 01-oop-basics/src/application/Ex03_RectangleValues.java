package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Ex03_RectangleValues {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // instance object
        Rectangle rectangle = new Rectangle();

        // *** input values ***

        // width
        System.out.print("Enter the width of a rectangle: ");
        rectangle.width = sc.nextDouble();

        // height
        System.out.print("Enter the height of a rectangle: ");
        rectangle.height = sc.nextDouble();

        // output
        System.out.println();
        System.out.print(rectangle);
    }
}
