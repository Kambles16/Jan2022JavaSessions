package Basics;

public class SwitchCase {
	
	public static void main(String arg[] ) {
		
		String role ="cutomerExecutive";
		
		switch (role) {
		case "salesperson":
			System.out.println("login via salesperson profile");
			break;
		case "admin":
			System.out.println("login via admin profile");
			break;
			
		case "cutomerExecutive":
			System.out.println("login via cutomerExecutive profile");
			break;
		case "broker":
			System.out.println("login via broker profile");
			break;
		default:
			System.out.println("check u enetered right profile");
			break;
		}
		
		
	}

}
