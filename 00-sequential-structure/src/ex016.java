/*
 * Problem Statement:
 * Write a program that repeatedly reads a password until it is valid.
 * For each incorrect password entered, print the message "Invalid Password".
 * When the correct password is entered, print the message "Access Granted"
 * and end the program.
 * Assume the correct password is 2002.
 */

import java.util.Scanner;

public class ex016 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input
        int pwd = sc.nextInt();

        while (pwd != 2022) {
            System.out.println("Invalid Password");
            pwd = sc.nextInt();
            }
        System.out.println("Access Granted");

    }

}