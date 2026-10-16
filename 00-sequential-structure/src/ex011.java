/*
 * Based on the table below, write a program that reads an item code and the
 * quantity of that item. Then, calculate and print the total amount to be paid.
 *
 * +------+------------------+--------+
 * | CODE | SPECIFICATION    | PRICE  |
 * +------+------------------+--------+
 * | 1    | Hot Dog          | $ 4.00 |
 * | 2    | X-Salad          | $ 4.50 |
 * | 3    | X-Bacon          | $ 5.00 |
 * | 4    | Toast            | $ 2.00 |
 * | 5    | Soda             | $ 1.50 |
 * +------+------------------+--------+
 */

import java.util.Locale;
import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price_hot_dog = 4.00;
        double x_salad = 4.50;
        double x_bacon = 5.00;
        double toast = 2.00;
        double soda = 1.50;

        int item = sc.nextInt();
        int amount = sc.nextInt();

        if (item == 1) {
            System.out.printf("TOTAL PRIZE: $ %.2f%n",price_hot_dog * amount);
        }

        else if (item == 2) {
            System.out.printf("TOTAL PRIZE: $ %.2f%n",x_salad * amount);
        }

        else if (item == 3) {
            System.out.printf("TOTAL PRIZE: $ %.2f%n",x_bacon * amount);
        }

        else if (item == 4) {
            System.out.printf("TOTAL PRIZE: $ %.2f%n",toast * amount);
        }

        else if (item == 5) {
            System.out.printf("TOTAL PRIZE: $ %.2f%n",soda * amount);
        }

        else {
            System.out.println("Invalid Value.");
        }
    }
}
