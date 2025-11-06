package Basic;



abstract class PaymentGateway {
	protected double transactionFeeRate;
	void calculateFee(double amount) {
		
	}
	public abstract boolean processPayment(double amount);
}


class CreditCardgateway extends PaymentGateway{
	protected double transactionFeeRate = 0.02;	
	@Override
	public boolean processPayment(double amount) {
		System.out.println("Processing credit card payment ...");
		return true;
	}
}

class PayPalGateway extends PaymentGateway{
	protected double transactionFeeRate = 0.035;

	@Override
	public boolean processPayment(double amount) {
		System.out.println("Processing PayPal payment ...");
		return true;
	}
}



public class Payment {
	public static void main(String[] args) {
		PaymentGateway [] allThePaymentGateWay = new PaymentGateway[]{new CreditCardgateway(), new PayPalGateway()};
      for(PaymentGateway paymentGateWay : allThePaymentGateWay){
          paymentGateWay.processPayment(100);
      }
  }
	
}


