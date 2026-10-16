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

        else if (salary >= 2000.01 &&  salary <= 3000.00) {
                double x =  (salary - 2000.00);
                double total_tax = x * 0.08;
                System.out.printf("$ %.2f", total_tax);
            }

        else if  (salary >= 3000.01 &&  salary <= 4500.00) {

            double x =  (salary - 3000.00);
            double tax_a = x * 0.18;

            double tax_b =  (salary - (2000.00) - x);

            double total_tax = (tax_a) + (tax_b * 0.08);
            System.out.printf("$ %.2f", total_tax);
        }

        else if  (salary > 4500.00) {

            double x =  (salary - 4500.00);
            double tax_a = x * 0.28;

            double tax_b =  (salary - 3000.00 - x);
            double tax_c = (salary - 2000.00 - x - tax_b);
            double total_tax = (tax_a) + (tax_b * 0.18) + (tax_c * 0.08);

            System.out.printf("$ %.2f", total_tax);
        }
    }
}
