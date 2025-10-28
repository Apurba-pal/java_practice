public class Bank {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("107301015236", 2000);
        System.out.println("Account Number " + ba.getAccountNumber());
        System.out.println("Account Balance " + ba.getBalance());
        ba.deposit(500);
        System.out.println("Account Balance " + ba.getBalance());

        ba.withdraw(5000);
    }
}