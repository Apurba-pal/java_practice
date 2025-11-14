package Basic;

public class PrimeMinister {
	String name = "modi";
	private static PrimeMinister pm;
	private PrimeMinister() {
		System.out.println("pm got elected");
	}
	
	public static PrimeMinister CreateandReturnPMObject() {
		if(pm == null) {
			pm = new PrimeMinister();
		}
		return pm;
	}
	
	public static void main(String[] args) {
		PrimeMinister pm = PrimeMinister.CreateandReturnPMObject();
		System.out.println("name: "+ pm.name);
	}
	
}
