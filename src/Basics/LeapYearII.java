package Basics;

import java.util.Scanner;

public class LeapYearII {

	public static void main(String[] args) {
		System.out.println("Enter a year");
		Scanner sc=new Scanner(System.in);
	    int year =sc.nextInt();
	    //if year is divisible by 4 but not 100 ;leap year
	    //year divisible by 400 leap year
	    
	    if (((year % 4==0)&&(year % 100!= 0)||(year %400 == 0))) {
        System.out.println(year +" leap year ");
	    }
	    else
	    System.out.println(year +" not leap year ");

}}
