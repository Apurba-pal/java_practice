public class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountMethod(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("deposit of rs." + amount + "is successfull!! new balance is " + balance);
        } else {
            System.out.println("deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("deposit amount must be positive");
        } else if (amount > this.balance) {
            System.out.println("insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("withdrawl of rs." + amount + "is successfull!! new balance is " + balance);
        }
    }
}
