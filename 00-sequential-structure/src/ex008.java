/*
Write a program that reads an integer and tells whether this number is even or odd.
*/

import java.util.Scanner;

public class ex008
{
    public static void main(String[] args)
    {
        // scanner
        Scanner sc = new Scanner(System.in);

        // vars
        int n = sc.nextInt();

        // return
        if (n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
