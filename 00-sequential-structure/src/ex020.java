import java.util.Scanner;

/*
 * Exercise 020: Count numbers in and out of range [10, 20]
 *
 * Problem statement:
 * Read the number of integers to be processed, then read those integers.
 * Count how many of them are in the range [10, 20] (inclusive) and how many are outside this range.
 * Print both counts.
 *
 * Example:
 * Input:
 * 5
 * 15
 * 25
 * 10
 * 5
 * 20
 *
 * Output:
 * COUNT IN RANGE: 3
 * COUNT OUT RANGE: 2
 */
public class ex020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // length
        int number_list =  sc.nextInt();

        int in = 0;
        int out = 0;

        for  (int c = 0; c < number_list; c++) {

            int number = sc.nextInt();

            if (number >= 10 &&  number <= 20) {
                in++;
            }

            else {
                out++;
            }

        }

        System.out.println("COUNT IN RANGE: " + in);
        System.out.println("COUNT OUT RANGE: " + out);
    }
}
