package entities;

public class Account {

    private static final double TAX = 5.00;

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public Account(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public Account(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String getHolder() {
        return accountHolder;
    }
    public void setHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {return balance;}

    public void cashDeposit(double amount) {
        this.balance += amount;
    }
    public void cashWithdraw(double amount) {
        this.balance -= (amount + TAX);
    }
}
