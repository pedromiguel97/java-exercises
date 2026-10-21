package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class appBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char response;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        Account account = new Account(accountHolder, accountNumber);

        do {
            System.out.print("Is there an initial deposit (Y/N)? ");
            response = Character.toUpperCase(sc.next().charAt(0));

            if (response == 'Y') {
                System.out.print("Enter initial deposit value: $ ");
                double balance = sc.nextDouble();
                account.cashDeposit(balance);
            } else if (response != 'N') {
                System.out.print("Invalid input. Try again. Is there an initial deposit (Y/N)? ");
            }
        } while (response != 'Y' && response != 'N');

        System.out.println("\nAccount data:");
        System.out.println("Account: "
                + account.getAccountNumber()
                + ", Holder: "
                + account.getHolder()
                + ", Balance: $ "
                + String.format("%.2f", account.getBalance()));

        System.out.print("\nEnter a deposit value: ");
        double balance = sc.nextDouble();

        if (balance > 0.00) {
            account.cashDeposit(balance);
        }

        System.out.println("Updated Account data:");
        System.out.println("Account: "
                + account.getAccountNumber()
                + ", Holder: $ "
                + account.getHolder()
                + ", Balance: "
                + String.format("%.2f", account.getBalance()));

        System.out.print("\nEnter a withdraw value: ");
        balance = sc.nextDouble();

        if (balance > 0.00) {
            account.cashWithdraw(balance);
        }

        System.out.println("Updated Account data:");
        System.out.println("Account: "
                + account.getAccountNumber()
                + ", Holder: "
                + account.getHolder()
                + ", Balance: $ "
                + String.format("%.2f", account.getBalance()));

        sc.close();
    }
}
