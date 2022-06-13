package superKeyword;

public class Employee {
	
	int Sal=100;
	
	public Employee() {
		System.out.println("parent class constructor");
	}
	
	public Employee(int a) {
		System.out.println("parent class overloaded constructor");
	}
	
	public void empSal() {
		System.out.println("Emp sal parent class");
	}
	
	public static void Logo() {          
		System.out.println("static Logo method");
	}
	
	public static final void Logo1() {          
		System.out.println("final Logo method");
	}

}
