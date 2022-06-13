import java.util.HashMap;

public class CountWordsHashMap {

	public static void main(String[] args) {
		
		String str= "I love automation and coding in JAVA and JAVA";
		String[] wordsOfString = str.split(" ");
		
		HashMap<String, Integer> map= new HashMap<String , Integer>();
		
		for(String st:wordsOfString ) {
			if(map.containsKey(st)) {
				map.put(st, map.get(st)+1);
			}else
				map.put(st, 1);
			
		}
		
		
		System.out.println(map);
		
		
		

	}

}
