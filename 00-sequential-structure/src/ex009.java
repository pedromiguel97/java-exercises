// Read two integer values (A and B). Then, the program must display the message "Are Multiples" or "Are Not Multiples",
// indicating whether the values read are multiples of each other.
// Note: the numbers may be entered in either ascending or descending order.

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        // Conditions:
        // 1 - Same number;
        // 2 - MOD == 0;
        if ((A == B) || (A % B == 0) || (B % A == 0)) {
            System.out.println("Are Multiples");
        }
        else {
            System.out.println("Are Not Multiples");
        }
    }
}