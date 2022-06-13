
public class countOccurance {

	public static void main(String[] args) {
		
	    //String str="I love JAVA coding and JAVA learning My JAVA skills are improving and";
		getWordCount("I love JAVA coding and JAVA learning My JAVA skills are improving and ", "love");
		getWordCount("I love JAVA coding and JAVA learning My JAVA skills are improving and ", "and");
		
		

	}
	
	public static void getWordCount(String str, String GivenWord) {
		int count =0;
		String word[]= str.split(" ");
		
		for(int i=0; i<=word.length-1; i++) {
			if(word[i].equalsIgnoreCase(GivenWord)) {
				count++;
			}
			
	}
		System.out.println(count); ;
}
}
