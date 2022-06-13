
public class EvenOdd {

	public static void main(String[] args) {

		findEvenOdd(30);
		findEvenOdd(15);
		findEvenOdd(-1);

	}

	public static void findEvenOdd(int num) {

		if (num % 2 == 0) {
			System.out.println("Given number is even number " + num);
		} else
			System.out.println("Givem number is odd number " + num);
	}

}
