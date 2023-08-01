package OOPConceptPart1;

public class Car {
	
	//outside main method - Global variables 
	
	//Class variables
	
	String model; //model no.
	int wheel;

	public static void main(String[] args) {
		
		//creating an object 
		//new keyword is used to create an object
		//ob1, 0b2, 0b3 - object reference variable/name
		//Class name followed by object name = new keyword class name again and braces
		
		Car ob1 = new Car(); //RHS - new Car(); - Object of the Class Car
		Car ob2 = new Car();
		Car ob3 = new Car();
		
		ob1.model = "BMW-X1";
		ob1.wheel = 4;
		
		ob2.model = "Mercedes-Benz";
		ob2.wheel = 4;
		
		ob3.model = "Audi";
		ob3.wheel = 4;
		
		System.out.println("Before references");
		
		System.out.println(ob1.model);
		System.out.println(ob1.wheel);
		
		System.out.println(ob2.model);
		System.out.println(ob2.wheel);
		
		System.out.println(ob3.model);
		System.out.println(ob3.wheel);
		
		System.out.println("After references");
		
		//change the reference variables 
		//ob1 = ob2 
		//ob2 = ob3
		//ob3 = ob1 // ob3=ob1 which is indirectly referring to ob2 (since ob1=ob2) // ob1 - no reference
		
		ob1 = ob2;
		ob2 = ob3;
		ob3 = ob1;
		
		System.out.println(ob1.model);
		System.out.println(ob2.model);
		System.out.println(ob3.model);
		
		
	}

}
