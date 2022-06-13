

public class findASCIIValue {

	public static void main(String[] args) {
		/*
		 * There are two ways to find ASCII value a a given character; a. Assign that
		 * character value to int variable b.Type casting that character into integer
		 */

		char ch = '0';// ascii value a=97
		int ascii = ch;

		int ASCIInumber = (int) ch;

		System.out.println(ascii);
		System.out.println(ASCIInumber);

	}

}
