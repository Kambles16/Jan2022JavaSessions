package Basics;

public class swapNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		
		temp=b; //20
		b=a; //b=10
		a=temp;//20
		
		System.out.println("a after swap is "+a);
		System.out.println("b after swap is "+b);
		
		
		int x=10, y=20;
		
		x= x+y;   //30
		System.out.println(x);//30
		y=x-y; //10
		x=x-y; //20
		
		System.out.println( x +" and "+ y);
		

	}

}
