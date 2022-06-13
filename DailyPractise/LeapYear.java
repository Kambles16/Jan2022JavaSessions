
public class LeapYear {

	public static void main(String[] args) {
		//year perfectly divisible by 4
		//year perfectly divisible by 100
		//year perfectly divisible by 400
		
		int year = 1900;
		
		boolean leapYear = false;
		if(year % 4==0 ) {
			if(year % 100==0) {
				if (year % 400==0) {
					leapYear= true;
				}else 
					leapYear=false;
			}else 
				leapYear= true;
		}else 
			leapYear= false;
		
	
	if(leapYear) {
		System.out.println(year +" year is a leap year" );
		}else 
	   System.out.println(year +" year is not a leap year" );

	}
}
	
	

