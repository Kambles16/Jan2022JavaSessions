package exceptionHandling;

public class TryCatchBlock_p {
	
	public void m1() {
		m2();
	}
    public void m2() {
		m3();
	}
    public void m3() {
		m4();
	}
    public void m4() {
    	int a[]= new int[4];
    	try {
		int i=9/0;
    	}catch (ArithmeticException e) {   
    		e.printStackTrace();
    		}
    	try {
    		a[4]=10;
    	}catch (ArrayIndexOutOfBoundsException e) {
    		e.printStackTrace();
    	}
    	
    	{
    	System.out.println("Exception handled");
    	}
        }

	    public static void main(String[] args) throws Exception {
		TryCatchBlock_p p=new TryCatchBlock_p();
		p.m4();
	    
		System.out.println("bye");

	    }

}
