package OOPConceptPart1;

public class LocalVsGlobalVariable {
	
	//Global variables
	String name = "Tom";
	int age = 25; // scope of this age is available throughout the program

	public static void main(String[] args) {

		int i = 10; //local variable of main method
		System.out.println(i);
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		int l = obj.sum();
			System.out.println(l);
		
		
		
	}
	
	public int sum()
	{
		int i = 15; // local variable of sum() method
		int j = 20;
		
		int k = i+j;

		int age = 25; //this age is available only inside sum() method
		System.out.println(age);

		return k;

		
	}
	
		

}
