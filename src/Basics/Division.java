package Basics;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a, b, c, d;
		
		Scanner sc= new Scanner(System.in);
    	System.out.println("Pls Enter marks of Science");
    	a= sc.nextInt();
    	
    	Scanner sc1= new Scanner(System.in);
    	System.out.println("Pls Enter marks of Maths");
    	b= sc1.nextInt();
    	
    	Scanner sc2= new Scanner(System.in);
    	System.out.println("Pls Enter marks of Physics");
    	c= sc2.nextInt();
    	
        d=(a+b+c)/3;
        System.out.println("% marks are "+ d);
        if(d>=90) {
        	System.out.println("Passed with Grade A");
        }
        else {
        	System.out.println("Passed with low greades");
        }
      
    	 }
}

