package JavaBasics;

public class StringConcatenation {


	public static void main(String[] args) {
		
		//+ is concatenation operator
		
		int a = 100; 
		int b = 200;
		
		String x = "Sharmila"; 
		String y = "Bhargav";
		
		double c = 12.33;
		double d = 24.87;
		
		char c1 = 'a';
		char c2 = '1';
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b); //SharmilaBhargav100200 Not SharmilaBhargav300
		
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(a+b+x+y+a+b);

		System.out.println(c+d);
		
		System.out.println(x+y+c+d);
		
		System.out.println(a+b+x+y+c1+c2+c+d);
		
		System.out.println("Hello World");
		
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		
		System.out.println("the sum of a & b is:"+(a+b));
		
		//print & println (print on the next line of the console)
		
		System.out.print("Hello Selenium");
		System.out.println("Hello Testing");
		
	}

}
