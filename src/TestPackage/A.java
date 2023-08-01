package TestPackage;

public class A { //Constructor with Super keyword
	
	public A()
	{
		System.out.println("Parent class -- Default constructor");
	}
	
	//If i have only a default constructor and if I have B class in the below way
	
	/* package TestPackage;

	public class B extends A{
	
	public B()
	{
		System.out.println("Child class -- Default constructor");
	}

	public static void main(String[] args) {

		B obj = new B();
		
	}

	}		
	} */	
	 
	
	/* As soon as the obj is created, execution starts from the main method
	   As B is extending A class, checks if there are any default constructors present, 
	   if yes - gets executed and then goes inside B constructor 
	 */
	
	public A(int i)
	{
		System.out.println("Parent class with value i "+i);
	}
	
	//As soon as I overload A() class with another constructor in parent class with 1 i/p parameter
	// to call this constructor we need to user super keyword and pass the value of the parameter
	
	//super(10); - if we don't write this super keyword default constructor is called 
	//runtime will check for the constructor with 1 i/p parameter and execute it first 
	
	public A(int j, int k)
	{
		System.out.println("value j "+j);
		System.out.println("value k "+k);
	}
	
	//if we write super() - with 2 i/p parameter 
	// 2 i/p parameterized constructor will be called
	
	
	}