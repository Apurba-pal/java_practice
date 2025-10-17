// Q2. create a superclass bank with the method getInterestRate(). Then create subclasses SBI, HDFC and ICICI that override this method with their own interest rates. use runtime polymorphism to display rates.
class Bank {
    public void getInterestRate() {
        System.out.println("Base Interest Rate");
    }
}
class SBI extends Bank {
    @Override
    public void getInterestRate() {
        System.out.println("SBI Interest Rate: 7%");
    }
}
class HDFC extends Bank {
    @Override
    public void getInterestRate() {
        System.out.println("HDFC Interest Rate: 6.5%");
    }
}
class ICICI extends Bank {
    @Override
    public void getInterestRate() {
        System.out.println("ICICI Interest Rate: 6.8%");
    }
}
class TestBank {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.getInterestRate();
        Bank sbi = new SBI();
        sbi.getInterestRate();
        Bank hdfc = new HDFC();
        hdfc.getInterestRate();
        Bank icici = new ICICI();
        icici.getInterestRate();
    }
}
