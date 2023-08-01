package JavaBasics;

public class IfElse {

	public static void main(String[] args) {
		
		 int a= 10;
		 a = 30;
		 int b = 20;
		 
		 if(a<b)
		 {
			 System.out.println("b is greater");
		 }
		 else 
		 {
			 System.out.println("a is greater");
		 }
		 
		 //comparision operators 
		 //< > <= >= == !=
		 
		 int c = 40;
		 int d = 60;
		 
		 if (c==d)
		 {
			 System.out.println("c&d are equal");		
		 }
		 else 
		 {
			 System.out.println("c&d are not equal");
		 }
		 
		 //write a logic to find the highest number
		 
		 int a1 = 500;
		 int b1 = 800;
		 int c1 = 300; 
		 
		 if(a1>b1 && a1>c1) // 4 conditions (f&f - f, t&f - f, f&t - f, t&t - t)
		 {
			 System.out.println("a1 is greatest");
		 }
		 else if(b1>c1)
		 {
			 System.out.println("b1 is greatest");
		 }
		 else 
		 {
			 System.out.println("c1 is greatest");
		 }
	}

}
