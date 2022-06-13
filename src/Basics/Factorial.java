package Basics;

public class Factorial {

	public static void main(String[] args) {
		
		fact(5);	
		

	}
	
	public static void fact(int n) {
		int fac= 1;
		while(n>0) {
			
			fac= fac* n;
			n=n-1;
			
		}
		System.out.println("factorial f number is "+ fac);
		
	}
	
}
