package accessModi1;

import accessModifiers.Car;  //as car class is in dif package we need to import it to call its var and methods

public class truck {

	public static void main(String[] args) {
		Car c= new Car();   
	//	c.str;  cant be accessed as its protected var
		double i=c.d; //as d is public var it can be accessed from anywhere
     //   c.days;
	}

}
