package Basics;

import java.util.Scanner;

public class SwapTwoNumbers {
  
	public static void main(String[] args) {
		int x, y, t;

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
	    x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("numbers before swap " +x + " and " +y);
		
		t=x;//t=20
		x=y;//x=10
		y=t;//y=12
		System.out.println("number after swap " +x + " and "+y);
	}

}
