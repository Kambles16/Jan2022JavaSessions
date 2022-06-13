package Basics;

public class countWords {

	public static void main(String[] args) {
		
		CountWords("IAmSujataKambleILoveAutomation");

	}

	public static void CountWords(String str) {
		
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)>= 'A'  && str.charAt(i)<= 'Z') {
				count++;
				}
			}
		System.out.println("no of words in String are " + count++);	
	}
}
