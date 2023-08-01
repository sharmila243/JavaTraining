package JavaBasics;

public class FinalizeConcept {
	
	public void finalize()
	{
		System.out.println("finalize method");
	}


	public static void main(String[] args) {

		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null; //now objects are referred as null (nobody is referring f1)
		f2 = null; 
		
		//GarbageCollector is used in clear/destroy all the null reference objects - creates space
		//finalize is method
		
		System.gc();
	 	
	}
	
	
}
