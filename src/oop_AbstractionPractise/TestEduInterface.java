package oop_AbstractionPractise;

public class TestEduInterface {

	public static void main(String[] args) {

		NAL nl = new NAL();  
		nl.Music();              //default method can be accessed 
		nl.Commerce();
		nl.Scinece();
		nl.Arts();
		
		nl.Maths(); 
		nl.Chemestry();
		nl.Physics();

		nl.zoology();
		nl.spaceReaserch();
		
		nl.qualityEduStd();//metod from super implemented class
		
		nl.educationforall();
		
		System.out.println("*****//Top casting******");
		//Top casting
		IndiaEdu IE=new NAL(); //parent reference var can access 
		IE.Arts();
		IE.Commerce();
		IE.Scinece();
		IE.scolarship();
		//IE.zoology();//  cant be accessed as its not available in interface IndiaEdu
        //IE.ReservationQuota(); parent interface cant access properties of chilc class
	    IE.qualityEduStd();   //IndiaEdu is child of GlobeEducationAsso
	  //  IE.educationforall(); As its method from Education class which is a parent of NAL so only NAL can access its method
	
	}

}
