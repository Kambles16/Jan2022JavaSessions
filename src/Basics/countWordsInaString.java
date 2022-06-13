package Basics;

public class countWordsInaString {

	public static void main(String[] args) {
		countWords("i m sujata kamble i love java ");	
		
	}

	public static void countWords(String str) {
		int count = 0;
		String arrayofWords[] = str.split(" ");
		System.out.println(arrayofWords.length);
//		for(int i=0; i<arrayofWords.length; i++) {
//			
//		}
		
	}
}