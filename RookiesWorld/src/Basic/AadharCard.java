package Basic;

public class AadharCard {
	private static AadharCard ac;
	private AadharCard() {
		System.out.println("aadharcard object created");
	}
	public static void createAadharCardObject() {
		if( ac == null) {
			ac=new AadharCard();
		}
	}
	
	public static void main(String[] args) {
		AadharCard.createAadharCardObject();
		AadharCard.createAadharCardObject();
		AadharCard.createAadharCardObject();
		
	}
}
