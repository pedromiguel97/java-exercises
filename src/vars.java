import java.util.Locale;

public class vars_traditional {
    public static void main(String[] args) {

        // Java Traditional

        // Set Var
        // double num = 10.512345;

        // Normal Print
        // System.out.println(num);

        // Print Format
        // System.out.printf("%.2f%n", num);

        // Set Local

        // formats
        // %f = double
        // %d = integer
        // %f = text
        // %n = line

        // Exercise 1
        System.out.println("Exercise 1");
        String name = "Pedro";
        int age = 29;
        double income = 10000.0;

        System.out.printf("%s has %d years and earns %.2f%n", name, age, income);

        // Exercise 2
        System.out.println("############################################");
        System.out.println("Exercise 2");

        // vars
        String prod1 = "Computer";
        String prod2 = "Office Desk";

        int age2 = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // output
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", prod1, price1);
        System.out.printf("%s, which price is $ %.2f%n", prod2, price2);

        System.out.printf("%nRecord: %d years old, code %d and gender: %c%n", age2, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);

        System.out.printf("%nMeasure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

    }
}