package hashMap;

import java.util.HashMap;

public class EcomApp { // HashMap is used to store user credentials of an e-commerce application

	public static void main(String[] args) {
		
		getCred("admin");
		
	}

	public static void getCred(String role) {

		HashMap<String, String> HM = new HashMap<String, String>();
		HM.put("admin", "admin@gmail:admin@123");
		HM.put("seller", "seller@gmail:seller@123");
		HM.put("user", "user@gmail:user@123");
		
		String Cred = HM.get(role);

		String Username = Cred.split(":")[0];
		String Password = Cred.split(":")[1];
		
		doLogin(Username, Password);

	}

	public static void doLogin(String Username, String Password) {
		System.out.println("Username is " + Username);
		System.out.println("Password is " + Password);
		System.out.println("Login success");

	}
}
