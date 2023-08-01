package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept { //Collection - Dynamic array

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100); //0
		ar.add(200); //1
		ar.add(300); //2
		
		System.out.println(ar.size());
		
		ar.add(400); //3
		ar.add(500); //4
		
		ar.add("Sharmila"); //5
		ar.add("Bhargav"); //6
		ar.add('A'); //7
		ar.add(17.24); //8
		
		System.out.println(ar.size());
		
		ar.remove(8);
		System.out.print("After remove method ");
		System.out.println(ar.size());
		
		System.out.println(ar.get(7));
		//System.out.println(ar.get(9)); //IndexOutOfBoundsException
		
		//to print all the values of ArrayList
		for(int i=0; i<ar.size(); i++)		
		{
			System.out.println(ar.get(i));
		}
		
		//Add only integer values to the ArrayList
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(65);
		//ar1.add("Sharmila"); //we can add only Integer values in the arraylist here
		
		
		//Add only String values to the ArrayList
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Bhargav");
		//ar2.add(100); //we can add only String values here
		ar2.add("100");
	 
		
		
	}

}
