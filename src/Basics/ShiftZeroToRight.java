package Basics;

import java.util.Arrays;

public class ShiftZeroToRight {
	
	
	private static int[] ShiftZeroToRightMethod(int[] a){
		
		if(a.length == 1) {
			
			return a;
		}
	    int newArray[] = new int[a.length];
	    int count =0; 
	    for (int number  :a) {
	    	if(number !=0) {
	    		newArray[count]= number;
	    		count++;
	    	}
	    	
	    }
	    return newArray;
	}
	public static void main(String[] args) {
		int [] i= new int[] {1};
	    System.out.println(Arrays.toString(ShiftZeroToRightMethod(i)));

	    
	    int [] i1= new int[] {1, 2,0,0,3,4,5};
	    
	    System.out.println(Arrays.toString(ShiftZeroToRightMethod(i1)));
	}

}
