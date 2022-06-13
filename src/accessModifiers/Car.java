package accessModifiers;

public class Car {
	
	private int a=10;            //can be accessed only within same class
	protected String str="Java";//can be accessed everywhere except dif package 
	public double d=13.3d;      // can be accessed from anywhere 
	int days=7;   //default -can be accesed from everywhere except class rom dif package

	public static void main(String[] args) {
		
		Car pm=new Car();
		System.out.println(pm.a);

	}

}
