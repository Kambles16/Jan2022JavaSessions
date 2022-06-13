package Basics;

public class Circle {

	public static void main(String[] args) {
		double radius=8;
	    double Circumference= CircumCircle(radius);
	    System.out.println("CircuOfCircle is "+ Circumference );

	    
	    double Area= AreaOfCircle(radius);
	    System.out.println("AreaOfCircle is "+ Area);
	}

	public static double CircumCircle(double r) {
		
		double circum=2*3.14*r;
		return circum;
		}
	
	public static double AreaOfCircle(double f) {
		double Area= 3.14*f* f;
		return Area;
		
	}
	
}
