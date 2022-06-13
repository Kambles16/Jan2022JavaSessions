package oop_AbstractionPractise;

public interface IndiaEdu extends GlobeEducationAsso{
	
	public void Scinece();
	
	public void Arts();
	
	public void Commerce();
	
	default void Music() {   //Java 8 onwards we can use method body and use default methods
		                     //default methods will not affect a class who is implementing the interface
	System.out.println("IndiAN education is incomplete without music");
	}
	
	public void scolarship();

}
