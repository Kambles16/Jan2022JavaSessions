package oop_Abstraction;

public interface USMedical {
	
	int i =10;
	
	//we can write only method body in an interface
	
	public void cardioServices();
	
	public void OncologyServices();
	
	public void physioServices();
	
    //jdk 1.8 onwards we can write method body
	
	public static void BillingServices() {
		System.out.println("US billing services");
	}
	
	//Default ss() {
		
	}



