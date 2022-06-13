package interViewQuestions;

import java.util.HashMap;

public class CountOccuranceinCharString {

	public static void main(String[] args) {
		
		getCharCount("23777777777");
		getCharCount("i love java");

	}

	public static void getCharCount(String str) {
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char ch : charArray) {
			if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
             }
			
			else 
				{
				charMap.put(ch, 1);
				}
		}
		
		System.out.println(str + ":" + charMap );

	}
	
}
