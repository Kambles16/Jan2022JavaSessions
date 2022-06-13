package Basics;

public class countOccurance {

	public static void main(String[] args) {
		String str= "GeeksforGeeks A computer science portal for geeks";
		getCount(str, "JABA");
	}

	
	public static void getCount(String str, String word) {
		
		int count =0;
		String a[]= str.split(" ");
		
		for(int i=0; i<a.length; i++) {
			if(word.equals(a[i])) {
				count++;
			}
		}
		System.out.println(count++);
	}
}
