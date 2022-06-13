package Basics;

public class CheckNumber {

	public static void main(String[] args) {
		
		int number=513;
		int result=checkNumberPosorNeg(number);
		if(result >0) {
			System.out.println("Number is positive");
		}else if (result <0)
		System.out.println("Number is negative");
		else 
		System.out.println("Number is zero(nither negative nor positive)");	
		

	}

	
	static int checkNumberPosorNeg(int i) {
		
		int b=Integer.signum(i);
		return i;
		
	}
	
}
