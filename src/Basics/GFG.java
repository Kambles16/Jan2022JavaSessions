package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GFG {

	public static void main(String[] args) {
		
		String[] ar= {"Sujata" , "Sudhir" , "Kanha"};
		
		//1. Arrays.AsList metod
//		List<String> al= Arrays.asList(ar);
//		System.out.println(al);
		
		//2. creating List object and use collections.addAll() method
//		List<String> al= new ArrayList<String>();
//		
//	    Collections.addAll(al, ar); 
//	    System.out.println(al);

		
		//3. add method
		
		List<String> al= new ArrayList<String>();
//		al.add(ar[0]);
//		al.add(ar[1]);
//		al.add(ar[2]);
		
		for(String s:ar) {
			
			al.add(s);
		}
		
		System.out.println(al);
	}

}
