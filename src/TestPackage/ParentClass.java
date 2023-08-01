package TestPackage;

public class ParentClass { //to prevent inheritance we use final keyword
	//Because of final keyword here we cannot inherit this in child class
	
	//to prevent MethodOverriding
	//to declare constant values
	

	
		public final void start() //in order to avoid method overriding also final keyword is used
		//child class cannot have this start method as it is declared final 
		{
			System.out.println("Parent --> start method");
		}
}
