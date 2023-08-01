package OOPConceptPart2;

public interface USBank { // is a reference type in java

	
	int min_bal = 100; //final in nature
	//only final & static variables 
	
	//we don't define the method body
	//we just declare the prototype of the method (method declaration)
	public void credit();
	public void debit();
	public void transferMoney();
	
	//In interface we can declare the variables
	//Variables are by default static in nature & methods are non-static in nature
	//Value of variables will not be changed
	//No static method in interface
	//Interface is part of OOP which is object (Objects - always take a copy of non-static method)
	//No main method
	//Interface are abstract in nature - we cannot create object of interface
	
	
}
