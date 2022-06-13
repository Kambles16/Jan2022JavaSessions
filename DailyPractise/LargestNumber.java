
public class LargestNumber {

	public static void main(String[] args) {
		int x = 12000, y = 1200, z = 1600000;
		if (x >= y) {
			if (x > z) {
				System.out.println("x is greatest");
			}
		}else if(y > z) {
			System.out.println(" y is gretest ");
		}else {
			System.out.println("z is greatest");
		}
	}
}
