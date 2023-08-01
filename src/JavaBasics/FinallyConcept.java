package JavaBasics;

public class FinallyConcept {

	public static void main(String[] args) {

		test1();
		test2();
		div();
		
		
	}
	
	public static void test1()
	{
		try
		{
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		
		finally //it's always used with try catch block 
		//it will always execute even if there's exception or not 
		{
			System.out.println("inside finally block");
		}
	}
	
	
	public static void test2()
	{
		try
		{
			System.out.println("inside test2 method");
		}
		finally
		{
			System.out.println("finally in test2 method");
		}
	}
	
	
	public static void div()
	{
		int i = 10;
		try
		{
			System.out.println("inside try block");
			int k = i/0;
		}
		catch(NullPointerException e)
		{
			System.out.println("inside catch block");
			System.out.println("Divide by zero error");
		}
		finally
		{
			System.out.println("Execute this code block even after any exception");
		}
	}
	
	//finally - database connection
	
	//finalize - related to GC - & is used to perform clean up memory processing 
	
	
	
	
}
