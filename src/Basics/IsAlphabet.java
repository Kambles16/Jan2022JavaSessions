package Basics;

public class IsAlphabet {

	public static void main(String[] args) {

		char c = '1';

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) { // c is comparing ASCII values of an alphabet

			System.out.println(c + " is a alphabet");

		} else {

			System.out.println(c + " is not an alphabet");
		}
		   IsAlphabet('2'); //  static method so can be called directly
	}

	public static void IsAlphabet(char c) {

		String str = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'z') ? "c is an aplhabet" : "c is not an alphabet";
		System.out.println(str);
	}

}
