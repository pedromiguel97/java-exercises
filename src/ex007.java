/*
Write a program that reads an integer and then tells whether this number is negative or not.
*/

import java.io.IOException;
import java.util.Scanner;

public class ex007 {

    public static void main(String[] args) throws IOException {

        /*
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        // scanner
        Scanner sc = new Scanner(System.in);

        // vars
        int x;

        // input
        x = sc.nextInt();

        if (x < 0){
            System.out.println("Negative number");
        }

        else {
            System.out.println("Not negative number");
        }

        sc.close();

    }

}