public class SubString {

	public static boolean subStringExample(String str, String sub) {
		return str.matches("(.*)" + sub + "(.*)");

	}

	public static boolean isSubString(String str1, String sub1) {
		return str1.contains(sub1);

	}

	public static boolean isSubString2(String str2, String sub2) {
		return str2.indexOf(sub2) != -1;
	}

	public static void main(String[] args) {
		System.out.println(subStringExample("I love Java", "Java"));
		System.out.println(isSubString("I love Java", "Java"));
		System.out.println(isSubString2("I love Kanha", "nha"));
		System.out.println(isSubString2("I love Kanha $$ Sudhir", "Sujata"));
		System.out.println(isSubString2("I love Kanha", " "));
		System.out.println(isSubString2("I love Kanha", "\\"));
		System.out.println(isSubString2("I love Kanha", " "));
	}

}
