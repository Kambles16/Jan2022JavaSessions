package accessModifiers;

public class BMW extends Car{

	public static void main(String[] args) {
		
		
		BMW b=new BMW();
		int c= b.days;  // final var can be accessed in child class but cant be changed
		System.out.println(c);
		//int i=b.a; as a is a private var cant be accesesd in chil class
		String ss=b.str;
		System.out.println(ss);//
	}

}
