package interViewQuestions;

public class ReverseAnumber {

	public static void main(String[] args) {
		reverseANumber(123345);
		getLengthOfString("sujatakamble");
		int[] arr = { 1, 21, 3, 5, 6, 9, 10 };
		getSizeOfArray(arr);

	}

	public static void reverseANumber(int num) {
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10; // rev=5, 54, 543
			num = num / 10;
		}
		System.out.println(rev);
	}

	public static void getLengthOfString(String str) {
		int length = 0;
		char ch[] = str.toCharArray(); // ch= s, u, j, a, t, a
		for (int i = 0; i <= ch.length - 1; i++) {
			length++;
		}
		System.out.println("lenth of String is " + length);
	}

	public static void getSizeOfArray(int[] arr) {
		int size = 0;

		for (int arr1 : arr) {

			size++;
		}

		System.out.println("size of Array is " + size);
	}
}
