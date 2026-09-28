import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {

        // scanner: input data function
        Scanner sc = new Scanner(System.in);

        // vars init
        int a, b, c, d, diff;

        // var scanner
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diff = (a * b - c * d);
        System.out.println("DIFERENCA = " + diff);
    }
}
