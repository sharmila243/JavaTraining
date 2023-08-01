package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//Polymorphism - allows the objects of different classes to be treated as objects of common class
		//it occurs when we have many classes that are related to each other by inheritance
		
		//Compile time Polymorphism -- Static Polymorphism - Eg. METHOD OVERLOADING
		//collects the information for calling a method during compilation time
		BMW b = new BMW();
		
		b.start();
		//whenever a method is common in child and parent class Preference is given to CHILD CLASS
		
		/* when same method is present in child class and parent class with same name
		 * and same no. of arguments, it is called METHOD OVERRIDING
		 * start() method - zero i/p parameter - Child - BMW and Parent - CAR Class
		 */
		
		b.stop();
		b.theftSafety();
		b.refuel();
		b.engine();
		
		System.out.println("********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//car class cannot have access/inherits properties from it's child class - BMW
		
		System.out.println("******");
		
		// new BMW(); //object is created without any reference
		Car c1 = new BMW(); //object is created using parent class reference variable - TOP CASTING
		//Child class object can be referred by parent class reference variable - Dynamic Polymorphism
		//Dynamic Polymorphism -- Run-time Polymorphism - Eg. METHOD OVERRIDING
		//collects the information for calling a method at run-time
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		//Common methods & Parent class methods can be called in Dynamic Polymorphism
		//we cannot have access to BMW methods (uncommon methods) just by creating an object
		
		//DOWN CASTING
		BMW b1 = (BMW)new Car();
		//Degrading cast of car class into child class object and then referred by Child class reference variable
		//CLASS CAST EXCEPTION during run-time
		
	}

}
