package exceptionHandling;

public class Finally {

	public static void main(String[] args) {
		int n1=Finally.getResult();
		System.out.println(n1);
		
	}
	
		public static int getResult() {
		try {
			int i=4/2;
			return 2;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		finally {
			return 90;    //finally block return value is overriden with try block return
		}

	}

}
