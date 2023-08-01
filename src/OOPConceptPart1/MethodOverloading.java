package OOPConceptPart1;

public class MethodOverloading { 
	
	/* Method Overloading --> when method is same with different arguments or i/p parameters 
	 							within the same class */

	public static void main(String[] args) {
			
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.diff();
		obj.sum(24);
		obj.sum(24.03);
		obj.sum(17, 24);
		obj.sum(11, 22.22);
		
	}
	
	//we can overload main method also but with different i/p parameters
	// main(int i)
	// main(int p, int q)
	public static void main(int i) {
		
	}
	public static void main(int p, int q) {
		
	}
	
	/*  we cannot create method inside a method OR
	 *  duplicate a method (same method names & same no. of i/p parameters with same data types - not allowed)
	 */
	
	/* If we already have 1 zero parameter method and 1 i/p parameter method (eg. int i)
	 * we cannot add another 1 i/p parameter method, even though with a different variable (eg. int j)
	 * Instead we can give 2 i/p parameters (int j, int k)
	 */
	
	// sum() method is now called overloaded method
	
	public void sum() // zero i/p parameter
	{
		System.out.println("SUM method -- zero parameter");
	}
	
	public void diff()
	{
		System.out.println("Diff method -- zero i/p parameter with different method name - allowed");
	}
	
	public void sum(int i) // 1 i/p parameter (data type - int)
	{
		System.out.println("SUM method -- 1 i/p parameter");
		System.out.println(i);
	}
	
	public void sum(double d) // 1 i/p parameter but with different data type (double)
	{
		System.out.println("SUM method -- 1 i/p parameter, different data type - allowed");
		System.out.println(d);
	}
	
	public void sum(int j, int k) // 2 i/p parameters
	{
		System.out.println("SUM method -- 2 i/p parameters");
		System.out.println(j);
		System.out.println(k);
		
		System.out.println(j+k);
	}
	
	public void sum(int x, double y)
	{
		System.out.println("SUM method --> 2 i/p parameters, different data types - allowed");
		System.out.println(x);
		System.out.println(y);
	}
	
	
	

}
