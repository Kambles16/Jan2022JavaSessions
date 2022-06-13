
public class StringManupulation {

	public static void main(String[] args) {

		String str = " Java is super language ";

		System.out.println(str.length());

		System.out.println(str.substring(0, 5));

		System.out.println(str.substring(7));

		System.out.println(str.replace("is", "are"));

		System.out.println(str.replace(" ", ""));
		
		System.out.println(str.charAt(10));
		
		System.out.println(str.indexOf("super", 0));
		
		String str2=str.trim();
		System.out.println(str2);

	}

}
