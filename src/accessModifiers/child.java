package accessModifiers;

public class child extends parent{

	public static void main(String[] args) {
		
		child c= new child();
		c.PrivateMethod();  
		c.DefaultMethod();
		c.ProtectedMethod();
		child.PublicMethod();
		

	}

}
