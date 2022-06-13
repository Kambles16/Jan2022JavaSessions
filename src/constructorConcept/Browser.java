package constructorConcept;

public class Browser {
	
	String name;
    double version;
	final String plugin="Xray";  //value o final variable cant be changed 
	static int days=7;  //we can't create constructors using static variable
	
	public Browser(double version ,int days) {
		this.version=version;
	    // this.days=days;  //this is wrong way of accessing static variable it can be accessed directly with clasname
		days=Browser.days;
	}
	
	public Browser(double version, String plugin) {
		this.version = version;
	//	this.plugin=plugin;// final var cant be assigned 
	}
	
    public Browser(String name, double version, String plugin) {
	    this.name = name;
		this.version = version;
		System.out.println(name +" "+version+" "+plugin);
	}

   public static void main(String[] args) {
		 Browser b= new Browser("Java", 1.2, "Xray");
		 Browser b1= new Browser(1.4d, "test");
		 Browser b2= new Browser(1.4d, 7);
		 System.out.println(days);
		 
		}

}
