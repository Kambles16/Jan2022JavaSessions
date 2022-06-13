package oop_Encapsulation;

public class test {

	public static void main(String[] args) {
		Encapsulation e1 = new Encapsulation();
		int age1 = e1.age;
		System.out.println(age1);

		int salary = e1.getSal();
		System.out.println(salary);

		Amezon login = new Amezon();

		login.setUsername("Sujata");
		String uname = login.getUsername();
		System.out.println(uname);
		login.setPassword("123");
		String pwd = login.getPassword();
		System.out.println(pwd);
	}

}
