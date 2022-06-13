package Basics;

public class StringOccurance {

	static String str = "I love JAVA";

	public static void main(String[] args) {
		getStringCharOccurance(str, 'i');

	}

	public static void getStringCharOccurance(String str, char val) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == val);
			{
				count++;

			}

		}
		System.out.println("count of Value" + count);
	}
}
