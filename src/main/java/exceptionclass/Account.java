package exceptionclass;

public class Account {
    
    int accountNumber;
    int balance;

    public Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(String accountNumber, double balance) {
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getMaxSubtract() {
        return 0;
    }

    public void setMaxSubtract(double maxSubtract) {
    }
}
