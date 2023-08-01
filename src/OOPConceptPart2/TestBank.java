package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		//we cannot create the object of the interface 
		
		//Compile-time Polymorphism - overridden methods will be called + Separate methods of class
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.mutualFund();

		
		hs.educationLoan();
		hs.CarLoan();
		
		System.out.println("*******");
		
		//Dynamic Polymorphism - child class object can be referred by parent class object variable 
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		//here I cannot access educationloan and carloan method
		//we can access only overridden methods
		
	}

}
