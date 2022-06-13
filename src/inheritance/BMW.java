package inheritance;



public class BMW extends Car {
	

	
	
	@Override
	public void start() {
		System.out.println("BMW start method");
		}
	
	public void AutoParking() {
		System.out.println("BMW Autoparking method");
	}
	
	
	
//	@Override :this is not an overridden method 
	public static void BMWstop() {
		
		System.out.println("I m BMW stop Method");
	}
	
	
}
