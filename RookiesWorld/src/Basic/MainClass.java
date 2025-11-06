package Basic;

public class MainClass extends Customer implements ReserveBank, ICICIBank{
	@Override
	public void Deposit() {
		System.out.println("deposit amount");
	}
	
	@Override
	public void Withdraw() {
		System.out.println("withdrawl amount");
	}
	public static void main(String[] args) {
		MainClass c = new MainClass();
		c.Deposit();
		c.Balance();
		c.Withdraw();
	}
}
