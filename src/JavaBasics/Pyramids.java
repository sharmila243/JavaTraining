package JavaBasics;

public class Pyramids {

	public static void main(String[] args) {
		
		
		int rows = 5; 
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
			
			
		}
		
		
		
		for(int m=1; m<=5; m++)
		{
			for(int n=5; n>=m; n--)
			{
				System.out.print(n + " ");
			}
			
			System.out.println();
		}
		
		
		for(int p=1; p<=5; p++)
		{
			for(int q=p; q<=5; q++)
			{
				System.out.print(q + " ");
			}
			System.out.println();
		}
		
		for(int x=5; x>=1; x--)
		{
			for(int y=x; y>=1; y--)
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
	}
	

}
