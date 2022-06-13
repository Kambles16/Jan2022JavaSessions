package Basics;

public class GreatestNumber {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		int c=400;
	   //int d=600;
		
	/*&& is called conditonal and and short ckt operator . I one of the condition is false 
		result is false*/
		
		if(a>b && a>c ) //false && false= false
			
			System.out.println("a is greatest");
		
		else if (b>a && b>c) //true && false =false
			System.out.println("b is greatest");
		
		else 
			System.out.println("c is greatest");
			
			
		
	}

}
