
public class isAlphabet {

	public static void main(String[] args) {
		checkChIsAlphabet ('a');
		checkChIsAlphabet('&');
	}
	
	public static void checkChIsAlphabet( char ch) {
		
		if( (  ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z')) {
			System.out.println("Entered charctor is an alphabet");
		}
		
		else System.out.println("Entered charector is not an alphabet");
	}

}
