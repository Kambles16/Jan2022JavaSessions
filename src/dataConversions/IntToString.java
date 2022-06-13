package dataConversions;

public class IntToString {

	public static void main(String[] args) {
		    int n=100;
		    String tt= String.valueOf(n); //returns String representation of the int value "100"
		    if (tt.equals("100")) {
		    	System.out.println("true");
		    }
		    else { 
		    	System.out.println("false");
		
	           }
		    
		boolean b= true;
		String ss=String.valueOf(b);
		System.out.println(ss); // "true"
		
		if(ss.equals("true")) {
			System.out.println("validation success");
		}else
			System.out.println("validation failed");

		
		String str="Welcome to \"JAVA\" world";  //we need to give \ -Escape char to ignore double qoutes
		//op: Wlecome to "Java" world
		System.out.println(str);

	}

}
