package Basic;
import java.util.*;

public class ATM implements Bank {
	int balance = 10000;
	@Override
	public void deposit(int amount) {
		balance += amount;
		System.out.println("Amount deposited: " + amount);
	}
	@Override
	public void withdraw(int amount) {
		balance -= amount;
		System.err.println("Amount withdrawn: " + amount);
	}
	@Override
	public void balance() {
		System.out.println("Amount is: " + balance);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM a = new ATM();
		int amount;
		boolean flag = true;
		while(flag) {
			System.out.println("Select Action:\n1. Withdraw money\n2. Deposit money\n3. Check balance\n4. Exit\nAction(1 / 2 / 3 / 4):");
			int input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("Enter amount to withdraw: ");
				amount = sc.nextInt();
				a.withdraw(amount);
				break;
			case 2:
				System.out.println("Enter amount to deposit: ");
				amount = sc.nextInt();
				a.deposit(amount);
				break;
			case 3:
				a.balance();
				break;
			case 4:
				flag = false;
			default:
				System.out.println("Invalid action! Try again");
				break;
			}
		}
	}
}