package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		TryCatchBlock t=new TryCatchBlock();
		t=null;
		
		int a[]= new int[3];
		System.out.println("A");
		try {
		int i=9/3;
		a[4]= 10;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		
		catch (NullPointerException e) {
			e.printStackTrace();
		}  
	   // System.out.println("Bye");
	    
	    finally {
	    	 System.out.println("Bye");
	    }
}
	
	

}
