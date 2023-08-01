package JavaBasics;

public class ConstructorConcept { 
	//is a class entity which is used to define class features while creating the object
	//If we want to define some class features in the form of  global variables/ objects -- use constructor
	
	//Constructor is used to initialize the class variables
	//Constructor is used to create an instance of a class
	//Sometimes	it is also referred to as special methods to initialize an object
	
	//1. is a method/function that does not return any value
	//2. Constructor name should be the same as class name 
	//3. Constructor is independent with each other so cannot be created inside a method
	
	String name; //class/instance variables
	int age;
	
	public ConstructorConcept() //constructor creation - default constructor - zero i/p parameter
	{
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i) //constructor is overloaded but with different i/p parameters
	{
		System.out.println("1 i/p param constructor");
		System.out.println(i);
	}
	 public ConstructorConcept(int j, int k) //duplicate constructor with same no. of parameters is not allowed
	 {
		 System.out.println("2 i/p param constructor");
		 System.out.println(j + " " + k);
	 }
	 
	 public ConstructorConcept(String s)
	 {
		 System.out.println("1 i/p parameter with different datatype");
		 System.out.println(s);
	 }
	 
	 public ConstructorConcept(String name1, int age1) //name and age here are local variables
	 {
	//	 this.name = name1; //to pass the values of local variables to class variables -- this keyword is used
	//	 this.age = age1; //this.classvariable = local variable
		 
		 name = name1;
		 age = age1;
		 
	 }


	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		
		//to call the constructor of any class we have to create an object
		//Because the object is created, constructor is called
		
		//After creating 3 constructors, if we run the program only the default constructor is called
		//In order to call the other 2 we need to create objects for those 2 constructors as well
		
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20,30);
		ConstructorConcept o = new ConstructorConcept("SuryaDimple");
				
		//All the constructors are called
		
		ConstructorConcept obj3 = new ConstructorConcept("SharmilaBhargav", 1724); //these values are given to local variables
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		
	}
	
	//this keyword
		//1. Invoke current class constructor
		//2. Invoke current class method
		//3. Return current class object
		//4. Pass an argument in method call
		//5. Pass an argument in constructor call

}
