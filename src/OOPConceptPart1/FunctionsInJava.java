package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {//main method or main function
		
	FunctionsInJava obj = new FunctionsInJava();
	//object created and obj is the object reference variable
	//After obj creation, copy of all non-static methods will be given to this object
	//object cannot hold static methods (Main method is Static method)
	
	obj.test();
	
	int l = obj.pqr();        //since it is returning int value, declare obj.pqr to some int and print it
		System.out.println(l);
	
	String s1 = obj.qa();     
		System.out.println(s1);
		
	int p = obj.division(30, 10);
		System.out.println(p);
	
	//main method is void because it returns a value
		
	}

	//non-static method


	//1 No i/p No o/p
	public void test()   //test() - method 
	{
		System.out.println("test method");
	}

	//2 No i/p Some o/p
	//return type of pqr method - int
	public int pqr()  //2 No i/p Some o/p
	{
		System.out.println("pqr method");
	
		int a = 10;
		int b = 20;
		int c= a+b;
		
		return c; //void don't return any value - replace void by the data type of the c which is integer
	}
	
	//return type - String
	public String qa()  //2 No i/p Some o/p
	{
		System.out.println("qa method");
		
		String s = "Selenium";
		
		return s;
	}
	
	//3 Some i/p Some o/p
	
	//x,y - i/p parameters/arguments
	//return type - integer
	public int division(int x, int y)
	{
		System.out.println("division method");
		int d = x/y;
		
		return d;
	}
	
	//Since the main method is empty nothing runs in the program
	//In order to call these methods/ access these methods, we need to create an Entity called Object
	//Jump to main method 

}

		
	


