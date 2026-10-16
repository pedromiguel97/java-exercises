import java.util.Scanner;

/*
 * Exercise 019: Print odd numbers in range
 *
 * Problem statement:
 * Read an integer n and print all odd numbers from 1 to n (inclusive).
 *
 * Example:
 * Input: 10
 * Output:
 * 1
 * 3
 * 5
 * 7
 * 9
 */
public class ex019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i=1; i <= n; i+=2){
            System.out.println(i);
        }
    }
}
