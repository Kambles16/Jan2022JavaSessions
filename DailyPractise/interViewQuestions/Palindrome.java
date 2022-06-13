package interViewQuestions;

public class Palindrome {

	public static void main(String[] args) {
	//	palindrome(1001, 1001);
		palindromeString("MADAM", "Madam");

	}

//	public static void palindrome(int num, int numGiven) {
//		int rev = 0;
//
//		while (num != 0) {
//
//			rev = rev * 10 + num % 10; // 0+1;
//			num = num / 10;
//		}
//		System.out.println(rev);
//
//		if (rev == numGiven) {
//			System.out.println("Entered number is palindrome");
//		}
//
//	}
	
	public static void palindromeString(String str, String inputString) {
		StringBuffer sb= new StringBuffer(str);
		StringBuffer ReversedString =sb.reverse();
		System.out.println(ReversedString);;
		String revString=ReversedString.toString();
		if(revString.equalsIgnoreCase(inputString)) {
			System.out.println("Given string is a palindrome");
		}
		
}
}
