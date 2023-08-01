package Abstraction;

public class TestBank {

	public static void main(String[] args) {
			
		HDFCBank hb = new HDFCBank();
		
		hb.credit(); //methods from parent class
		hb.debit(); //methods from parent class
		hb.loan(); //overridden method
		hb.insurancePolicy(); // HDFC's own method
		
		Bank b = new HDFCBank(); //Dynamic Polymorphism
		b.credit();
		b.debit();
		b.loan();
				
	}

}
