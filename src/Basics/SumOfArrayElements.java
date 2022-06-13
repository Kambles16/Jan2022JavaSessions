package Basics;

public class SumOfArrayElements {

	public static void main(String[] args) {
	
	     int ar[]= {10, 20, 30, 40};
	     int sum=0;
	     for(int num: ar) {
	    	sum=sum+num;
	    
	     }
         System.out.println("sum of elements of an array :"+ sum);
	}

}
