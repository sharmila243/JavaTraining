package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	//Global variables will be available through out the program with some conditions
	//Conditions - static & non-static methods and variables
	
	String name = "Tom"; //non-static Global variable
	static int age = 25; //static Global variable

	public static void main(String[] args) {
		
		//how to call static methods and variables 
		//1. direct calling
		sum();
		
		//2. Calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non-static methods and variables 
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();	
		System.out.println(obj.name);
		
		//Can I access static methods using object reference variable
		obj.sum(); //warning - not a good practice

	}
	
	public void sendMail() //non-static method
	{
		System.out.println("send mail method");
	}

	public static void sum() //static method
	{
		System.out.println("sum method");
	}
	
}
