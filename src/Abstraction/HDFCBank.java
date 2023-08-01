package Abstraction;

public class HDFCBank extends Bank {
	 
	//Any class extending abstract class, we need to define the abstract method of that abstract class
			//if not compiler gives the error
	
	//other than the abstract method of the abstract class 
			//we need not define any non-abstract methods of the abstract class
	
	public void loan() //Overridden method
	{
		System.out.println("HDFC -- loan method");
	}
	
	public void insurancePolicy()
	{
		System.out.println("HDFC -- Insurance Policy");
	}

}
