/*
 * Write a program that reads an employee's number, the number of hours
 * worked, and the amount received per hour, and calculates this
 * employee's salary. Then, display the employee's number and salary,
 * with two decimal places.
 */

import java.util.Scanner;
import java.util.Locale;

public class ex004 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num_func, hours_worked;
        double salary;

        num_func = sc.nextInt();
        hours_worked = sc.nextInt();
        salary = sc.nextDouble();

        System.out.println("NUMBER = " + num_func);
        System.out.printf("SALARY = U$ %.2f%n", (salary *  hours_worked));
    }
}
