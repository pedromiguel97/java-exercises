/*
 * Problem: Fuel Preference Survey
 *
 * A gas station wants to find out which of its products its customers prefer.
 * Write an algorithm that reads the type of fuel each customer filled up with,
 * coded as follows:
 *
 *   1. Alcohol (Ethanol)
 *   2. Gasoline
 *   3. Diesel
 *   4. End
 *
 * If the user enters an invalid code (outside the range 1 to 4), the program
 * must ask for a new code until a valid one is entered.
 *
 * The program ends when the code entered is 4. It must then print the message
 * "THANK YOU VERY MUCH" followed by the number of customers who filled up
 * with each type of fuel, as shown in the example below.
 *
 * Example input:
 *   8
 *   1
 *   7
 *   2
 *   2
 *   4
 *
 * Example output:
 *   THANK YOU VERY MUCH
 *   Alcohol: 1
 *   Gasoline: 2
 *   Diesel: 0
 */

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // codes
        // 1 - Alcohol
        // 2 - Gasoline
        // 3 - Diesel
        // 4 - Exit

        // input
        int choice = sc.nextInt();
        int qtd_alcohol = 0;
        int qtd_gasoline = 0;
        int qtd_diesel = 0;

        // condition
        while (choice != 4) {

            if (choice < 4 && choice > 0) {
                switch (choice) {
                    case 1:
                        qtd_alcohol += 1;
                        choice = sc.nextInt();
                        break;
                    case 2:
                        qtd_gasoline += 1;
                        choice = sc.nextInt();
                        break;
                    case 3:
                        qtd_diesel += 1;
                        choice = sc.nextInt();
                        break;
                }
            }

            else {
                System.out.println("ERROR: INVALID CHOICE. Please try again.");
                choice = sc.nextInt();
            }
        }

        System.out.println("Thank you!");
        System.out.println(qtd_alcohol);
        System.out.println(qtd_gasoline);
        System.out.println(qtd_diesel);
    }

}
