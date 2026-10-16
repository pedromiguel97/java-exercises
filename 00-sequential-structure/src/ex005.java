/*
 * Write a program that reads the code of part 1, the quantity of
 * part 1, and the unit price of part 1, followed by the code of
 * part 2, the quantity of part 2, and the unit price of part 2.
 * Calculate and display the total amount to be paid.
 */

import java.util.Scanner;
import java.util.Locale;

public class ex005 {
    public static void main(String[] args) {

        // vars
        int piece_1, piece_2, quantity_1, quantity_2;
        double price_1, price_2;

        // set locale
        // always before scanner
        Locale.setDefault(Locale.US);

        // scanner
        Scanner sc = new Scanner(System.in);

        piece_1 = sc.nextInt();
        quantity_1  = sc.nextInt();
        price_1 = sc.nextDouble();

        piece_2 = sc.nextInt();
        quantity_2  = sc.nextInt();
        price_2 = sc.nextDouble();

        System.out.printf("TOTAL PRIZE: U$ %.2f\n", (price_1 *  quantity_1) + (price_2 * quantity_2));
    }
}
