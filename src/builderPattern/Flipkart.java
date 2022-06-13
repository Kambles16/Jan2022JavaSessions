package builderPattern;

public class Flipkart {
  
	public Flipkart login() {
		System.out.println("Login method");
		return this;     //this will return the current class object
	}
	
	public Flipkart login(String uname ,String Pwd) {
		System.out.println("Login method");
		return this;
	}

	public Flipkart search(String name) {
		System.out.println("search product with name");
		return this;
	}
	
	public Flipkart search(String name , int price) {
		System.out.println("search product with name");
		return this;
	}
	
	public Flipkart addToCart(String name) {
		System.out.println("Add  product with name in cart");
		return this;
	}
	public Flipkart doPayment(int OTP , int CCNo) {
		System.out.println("Add  product with name in cart");
		return this;
	}
	public Flipkart doPayment(int OTP) {
		System.out.println("Add  product with name in cart");
		return this;
	}
	public Flipkart logout() {
		System.out.println("logout");
		return this;
	}
	
	
}

