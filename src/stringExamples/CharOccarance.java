package stringExamples;

public class CharOccarance {

	public static void main(String[] args) {
		String str = "I love JAVA coding JAVA and testing";
		getCharCount(str, 'A');
		getCharOccurance(str, 't');

	}

	public static void getCharCount(String str, char val) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == val) {
				count++;
			}
		}
		System.out.println("A" + ":" + count++);
	}

	public static void getCharOccurance(String str, char val) {
		
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)== val) {
				count++;
			}
		}
         System.out.println(val +":"+ count++);
	}
}
