package hashMap;

import java.util.HashMap;

public class HashMapConcept {
	
	public static void main(String args[]) {
	
	HashMap<String, Integer> map= new HashMap<String , Integer>(); //HashMap is a class which implements Map interface
	
	map.put("Kanhoba", 10);  //put method to add values in Map in key value pairs
	map.put("Sujata", 100);
	map.put("Sudhir", 10000);
	map.put(null, 10);        //null value can be stored
	map.put(null, null);     //key and value both can be null
	map.put("Durga", null); //value can be null
	
	System.out.println(map.get("Kanhoba")); //10
	System.out.println(map.get(null)); //10 //if we have stored two nulls ten the recent value of null will be returned
    System.out.println(map.get("Durga"));
}
}
