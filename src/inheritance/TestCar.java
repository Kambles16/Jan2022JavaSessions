package inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW Obj= new BMW(); //obj of child class can access both child and parent methods
		Obj.AutoParking();  //child method
		Obj.start();        //parent method Overriden by child can be accessed
		Obj.stop();         //parent method can be access by child
		BMW.BMWstop();      //static method so can be accessed by classname.method name
		BMW.SuperStart();   //method from grandparent
 
		Car Obj1= new Car();  //Object of parent class ; only access own mwthods
	    Obj1.start();         
	    Obj1.stop();
	    Obj1.stop();
	    Obj1.SuperStart();
         
		Car Obj2=new BMW(); //object of Child and parent as obj referece variable
		Obj2.start();    //only parent methods can be accessed but if a method is overroden method thenchild method is called
		Obj2.stop();
		Obj2.Refuel();
		Obj2.SuperStart();
		
		BMW Obj3= (BMW) new Car(); 
		Obj3.AutoParking();
		Obj3.start();
		Obj3.stop();
		Obj3.BMWstop();
		
		
	}

}
