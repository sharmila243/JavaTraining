package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank { //achieving multiple inheritance
	//2 parents of a single class 
	//"Is-a relationship"
	
	
	//If a class is implementing any interface, 
	//						then it's mandatory to define/override all the methods of Interface


	//HSBC has to implement methods from USBank
	//and also HSBC can have it's own methods
	
	//USBank methods
	public void credit()
	{
		System.out.println("HSBC Credit");
	}
	
	public void debit()
	{
		System.out.println("HSBC Debit");
	}
	
	public void transferMoney() 
	{
		System.out.println("HSBC TransferMoney");
	}
	
	
	//HSBC own methods
	public void educationLoan()
	{
		System.out.println("HSBC EducationLoan");
	}
	
	public void CarLoan()
	{
		System.out.println("HSBC CarLoan");
	}
	
	//BrazilBank method
	public void mutualFund()
	{
		System.out.println("HSBC mutualFund - BrazilBank");
	}
	
	//ACHIEVING MULTIPLE INHERITANCE
}
