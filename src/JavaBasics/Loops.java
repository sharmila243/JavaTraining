package JavaBasics;

public class Loops {

	public static void main(String[] args) {
		
		//while loop 1 to 10
		
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++; //without incremental/decrement statement, prints i=1 infinite times (infinite loop)
		}
		
		//for loop 1 to 10
		
		int j;
		for(j=1;j<=10;j++)
		{
			System.out.println(j);
		}
		
		// 10 to 1 
		
		for(int k=10; k>=1;k--)
		{
			System.out.println(k);
		}
	}

}
  