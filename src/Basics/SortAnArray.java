package Basics;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArray {

	public static void main(String[] args) {
		int[] a1 = {129, 7, 12, 5,300};
		sortArray(a1);
		   
	}
	
	public static void sortArray(int[] a) {
		
	    int temp =0;
		
		for(int i=0; i<4; i++) {
		   if(a[i]>a[i+1]) {
			   temp=a[i+1];  // temp=7
			   a[i]=temp;   // a1[i]=7
			   a[i+1]=a[i];//a[i+1]= 129
			   i++;
		   }
		System.out.println("Array" +a.toString());
	}
}
}

