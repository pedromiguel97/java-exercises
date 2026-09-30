/*
 * Read 2 values with one decimal place (x and y), which represent the
 * coordinates of a point on a plane. Then, determine which quadrant the point
 * belongs to, or whether it lies on one of the Cartesian axes or at the
 * origin (x = y = 0). If the point is at the origin, print the message
 * "Origin". If the point is on one of the axes, print "X Axis" or "Y Axis",
 * depending on the case.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        }

        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }

        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }

        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }

        else if (x == 0.0 && y == 0.0){
            System.out.println("Origin");
        }
    }
}
