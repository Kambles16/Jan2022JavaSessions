package oop_AbstractionPractise;

public class NAL extends Education implements IndiaEdu, UKEdu ,UsEdu{

	@Override
	public void Scinece() {
		System.out.println("Science method from indian Edu");

	}

	@Override
	public void Arts() {
		System.out.println("Arts method from indian Edu");

	}

	@Override
	public void Commerce() {
		System.out.println("Commerce method from indian Edu");
	}

	@Override
	public void Physics() {
		System.out.println("Physics method from UK Edu");
		
	}

	@Override
	public void Chemestry() {
		System.out.println("Chemestry method from UK Edu");
		
	}
	//@Override
	public static void Maths() {    //java 8 onwards we can write static methods in interface also but we can't overrode them in implemented class
		System.out.println("UK education has the best Maths course");
	}

	@Override
	public void spaceReaserch() {
		System.out.println("spaceReaserch from USEdu");
		
	}

	@Override
	public void zoology() {
		System.out.println("zoology from USEdu");
		
	}

	//@Override :common metod in all class can be overriden it can be written only once
	public void scolarship() {
		System.out.println("Scholarship shpuld be given to the taleneted students");
		
	}
	
	//own method 
	public void ReservationQuota() {
		System.out.println("NAL ReservationQuota ");
	}

	@Override
	public void qualityEduStd() {
		System.out.println("As per GlobeEduAsso everyone shoudl get qualityEdu");
		
	}
	
	

//Default method canot be overriden in child class	
//	default void Music() {
//		System.out.println("IndiAN education is incomplete without music");
//	}
	
}
