package oop_Abstraction;

public class TestInterface {

	public static void main(String[] args) {
		
		//UkMedical UKM=new UkMedical();   //interface object can't be created 
		FortisHospital fh= new FortisHospital();//object of child class can access all the properties
		fh.CardiacServices();
		fh.cardioServices();
		fh.entServices();
		fh.GynicServices();
		fh.physioServices();
		fh.OncologyServices();
		fh.orthoServices();
		fh.Donations();
		fh.BillingServices();   //this will call fortisHospital Billing services
		
		
		fh.CoVid19Research();
		fh.medicalEquipment();
		fh.CoVid19Research();
		fh.medicalStudy();
		
		UkMedical UKM = new FortisHospital();// Top casting object of child class and parent class ref variable
        UKM.CardiacServices();    //only methods of parent class which are overridden in child can be accessed.
        UKM.entServices();
        UKM.orthoServices();//UKM.GynicServices();    //method from only Fortis cant be accessed
        fh.Donations();// FortisHospital fhUK= new UkMedical(); not allowed down casting
        UKM.Donations(); //common method can be accessed
        
        
        
        FortisHospital fh1= new FortisHospital();
        fh1.CardiacServices();
        fh1.physioServices();
        fh1.Donations();
        fh1.entServices();
        fh1.OncologyServices();
        fh1.GynicServices();
        fh1.orthoServices();
        
        
        
	}

}
