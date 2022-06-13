package superKeyword;

public class TestKeyword extends Employee {
	int Sal = 200;

	public TestKeyword() { // constructor
		super(10);         //this will call parent class constructor    
        System.out.println("I am child class const"); 
        
		
	}

	public void empSal() {
		System.out.println("Emp sal testKeyword");
		System.out.println(super.Sal); // it will give parent class salary variable
		super.empSal();   // parent method can be accessed
		super.Logo();    // static method also can be accessed
		super.Logo1();  // final method also accessed with the help of super keyword
	}

	public static void main(String[] args) {
		TestKeyword tk = new TestKeyword();  //as soon as object is created parent class constructor is called
		System.out.println(tk.Sal); // current class salary will be returned
		tk.empSal(); // current class method will be called

	}

}
