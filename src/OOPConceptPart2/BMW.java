package OOPConceptPart2;

public class BMW extends Car{ //"has- a relationship"

	//In order to attain relation b/w 2 classes we need to use extends keyword
	//BMW - Child class
	//Car - Parent class since BMW is extending/inheriting properties of parent class -- Car
	
	@Override
	public void start()
	{
		System.out.println("BMW -- start");
	}
	
	public void theftSafety()
	{
		System.out.println("BMW -- theftSafety");
	}
		
	//BMW is having access to all the 3 methods of Car Class and the above 2 methods
}
