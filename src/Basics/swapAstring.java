package Basics;

public class swapAstring {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="World";
		
		//1. Append a and b
		a = a+b ;  //HelloWorld
		
		//2.store initial string in b
		b=a.substring(0, a.length()-b.length()); //b=Hello
		
		//3.store initial string b in string a
		
		a=a.substring(b.length());
		System.out.println( a +" and "+ b);
		
		

	}

}
