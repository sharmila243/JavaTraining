package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		//Integer, Double, Boolean
		
		
		//String to Integer conversion
		//to convert string "100" to integer 100 we need to use Wrapper Class - parseInt
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		
		//String to Double conversion
		String s = "12.33";
		Double d = Double.parseDouble(s);
		System.out.println(d+10);
		
		//String to Boolean
		String y = "true";
		boolean k = Boolean.parseBoolean(y);
		System.out.println(k);
		
		//integer to string conversion
		int j = 100;
		System.out.println(j+200);
		
		String str = String.valueOf(i);
		System.out.println(str + 20);
		
		//String to Integer - If string is not a pure numerical it gives - NUMBER FORMAT EXCEPTION
		String v = "100A"; 
		int l = Integer.parseInt(v); 
		System.out.println(l);
		
		
	}

}
