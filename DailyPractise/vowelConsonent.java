
public class vowelConsonent {

	public static void main(String[] args) {

		isVowelorConsonenet('z');
		System.out.println(isStringContainsVowels("Hello"));

	}

	public static void isVowelorConsonenet(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a Vowel");

		} else
			System.out.println(ch + " is a consonent");
	}
	
	public static Boolean isStringContainsVowels(String input) {
		
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
