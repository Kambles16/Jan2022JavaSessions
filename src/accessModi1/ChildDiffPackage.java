package accessModi1;

import accessModifiers.parent;

public class ChildDiffPackage {

	public static void main(String[] args) {
		
		ChildDiffPackage p2=new ChildDiffPackage();   //object of class from different package so need to import that class
       // p2.PrivateMethod();//can't be accessed in diff class
	}

}
