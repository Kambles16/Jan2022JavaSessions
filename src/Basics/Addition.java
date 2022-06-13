package Basics;

public class Addition {

	public static void main(String[] args) {
		
		int a=10,b=20;
		int c= a +b;
		System.out.println("sum of two numbers "+ c);
		
	
		Addition add=new Addition();
		add.sum(5, 25);
		
	}
	
	public int sum(int a, int b) {
		int c= a+b;
		System.out.println( "c = "+ c);
		return c;
	}
	
	

}
