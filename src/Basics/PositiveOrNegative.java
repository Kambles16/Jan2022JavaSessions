package Basics;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		System.out.println("Eneter a number");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		
		if (a>0) {
			
			System.out.println("Enetered number is positive");
		}
		else if (a<0)
			
		System.out.println("Number is negative");
		
		else
		{
			System.out.println("Given number is zero");
		}	

	}

}
