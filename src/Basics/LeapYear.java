package Basics;

public class LeapYear {

	public static void main(String[] args) {
		int year=2012;
		boolean leap=false;
		if (year % 4==0) {      //if year is perfectly divisble by 4 then its a leap year
			 if (year % 100 == 0) {   //if year divisible by 100 then century year 
			    if(year % 400 == 0) {   //century year is leap year only and only it is divible by 400
			    	leap= true;
			    }
			    else leap= false;
			 }
			 else leap= true;
			 
		}
		else leap=false;
		
		if(leap) {
			System.out.println(year +" is a leap year");
		}
			else {
			System.out.println(year +" is not a leap year");	
		}}
	}
		
	
		
		
	


