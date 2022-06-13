
public class QoutientandReminder {

	public static void main(String[] args) {
		printQoutient(122, 10);
		printReminer(123, 5);
	}
	
	public static void printQoutient(int dividend , int divisor) {
		int qoutient= dividend/divisor;
		System.out.println(qoutient);
	}
	
	public static void printReminer(int dividend , int divisor) {
		int qoutient= dividend%divisor;
		System.out.println(qoutient);
	}

}
