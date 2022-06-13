package Basics;

public class Print1to100WithoutLoops {

	public static void main(String[] args) {
		
	  // printNum(1);
	   printNumber(1,100);
		
	}

	//using recursion 
	
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);   //same method is called within method
		}
	}
	
	public static void printNumber(int startNum, int EndNum) {   //without using hardcoded values
		  if(startNum<=EndNum) {
			  System.out.println(startNum);
			  startNum++;
			  printNumber(startNum,EndNum);
		  }
		
		  
		//Using JavaStream 
		  
	//	IntStream.range(1,100).forEach(e->system.out.println()
	}
}
