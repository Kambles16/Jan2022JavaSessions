package accessModifiers;

public class parent {
	
	public static void PublicMethod() {
		System.out.println("i m bublic method and everyone can access me ");
	}
	public void ProtectedMethod() {
		System.out.println("i m Protected Method and dif class from diff pacakge cant access me ");
	}
	public void DefaultMethod() {
		System.out.println("i m Default Method and dif class from diff pacakge cant access me ");
	}
	public void PrivateMethod() {
		System.out.println("i m Private Method and can be accessed in current class only ");
	}

	public static void main(String[] args) {
		
		parent p =new parent();
		p.DefaultMethod();
		p.PrivateMethod();
		p.ProtectedMethod();
		parent.PublicMethod();
	}

}
