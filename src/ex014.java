/*
 * In an imaginary country called Lisarb, all inhabitants are happy to pay
 * their taxes, because they know there are no corrupt politicians there and
 * the collected resources are used for the benefit of the population, without
 * any misuse. The currency of this country is the Rombus, whose symbol is R$.
 *
 * Read a value with two decimal places, equivalent to the salary of a person
 * from Lisarb. Then, calculate and print the amount this person must pay in
 * Income Tax, according to the table below.
 *
 * +-----------------------------+------------+
 * | INCOME                      | INCOME TAX |
 * +-----------------------------+------------+
 * | from 0.00 to R$ 2000.00     | Exempt     |
 * | from R$ 2000.01 to 3000.00  | 8 %        |
 * | from R$ 3000.01 to 4500.00  | 18 %       |
 * | above R$ 4500.00            | 28 %       |
 * +-----------------------------+------------+
 *
 * Remember: if the salary is R$ 3002.00, the 8% rate applies only to
 * R$ 1000.00, because the salary range from R$ 0.00 to R$ 2000.00 is exempt
 * from Income Tax. In the example provided, the tax is 8% on R$ 1000.00 +
 * 18% on R$ 2.00, which results in R$ 80.36 in total. The value must be
 * printed with two decimal places.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        if  (salary >= 0 &&  salary <= 2000.00) {
            System.out.println("Exempt");
        }

        else {

            double x = salary - 2000.00;

            if (x >= 2000.01 &&  x <= 3000.00) {
                System.out.printf("$ %.2f", x * 0.08);
            }

            else if  (x >= 3000.01 &&  x <= 4500.00) {
                System.out.printf("$ %.2f", x * 0.18);
            }

            else if  (x > 4500.00) {
                System.out.printf("$ %.2f", x * 0.28);
            }
        }

    }
}
