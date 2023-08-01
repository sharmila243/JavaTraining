package TestPackage;

public class B extends A{
	
	public B()
	{
		super(10, 20); // super keyword is used to call the parent class constructor
		//super() keyword should always be written inside child class Constructor
		//super() keyword should be the first statement it cannot be second or anything
		//Inside a constructor we cannot have 2 super() keywords
		//if we want to call multiple constructors using super keyword 
				// we need to create multiple child class constructors with needed i/p parameters
				// and write the first line of each constructor super() keyword
				// and create an object to call the constructor
		
		System.out.println("Child class -- Default constructor");
	}

	public static void main(String[] args) {

		B obj = new B();
		
	}

}
