package application;

import entities.Converter;

import java.util.Locale;
import java.util.Scanner;

public class Ex06_CurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in USD will be bought: ");
        double amount = sc.nextDouble();

        double finalAmount = Converter.finalAmount(amount);
        System.out.printf("Amount to be paid in BRL: %.2f", finalAmount);

    }
}
