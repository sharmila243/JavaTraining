package Abstraction; //to hide implementation logic 
					 // we have defined loan method here but did not define any implementation logic  
					 //All the implementation logic will be given by child classes - HDFC
						// like interest rate

public abstract class Bank { //Both Abstract class & Interface are used to achieve ABSTRACTION

	//if we want to define the above class as abstract class add abstract keyword
	
	//At least one method has to be abstract in nature 
	//abstract method - prototype - no method body only declaration
	
	//cannot create the object of abstract class
	//Bank b = new Bank(); -- not possible
	
	//Partial abstraction 
	
	public abstract void loan(); // no method body
	
	//In abstract class we can have multiple abstract methods and multiple non-abstract methods
			//at least 1 abstract method has to be present
	
	//these below two non-abstract methods are common for all the child classes
	//we need not define them in the child class, we can directly inherit from here  
	public void credit() //non-abstract method and so has method body of it's own
	{
		System.out.println("Bank -- credit");
	}
	
	public void debit() //non-abstract method and so has method body of it's own

	{
		System.out.println("Bank -- debit");
	}
	
	
}
