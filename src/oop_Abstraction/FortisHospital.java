package oop_Abstraction;

public class FortisHospital extends Medical implements UkMedical,USMedical {       

	@Override
	public void entServices() {
		System.out.println("ENT services UkMedical");
	}

	@Override
	public void CardiacServices() {
		System.out.println("Cardiac Services UkMedical");

	}

	@Override
	public void orthoServices() {

		System.out.println("ortho Services UkMedical");

	}
	
    public  void BillingServices() {
		System.out.println("FH  billing services");
	}


	@Override
	public void cardioServices() {
		System.out.println("Cardio Services UsMedical");
		
	}

	@Override
	public void OncologyServices() {
		System.out.println("Oncology Services UsMedical");
		
	}

	@Override
	public void physioServices() {
		System.out.println("physio Services  UsMedical");
		
	}
	
	public void GynicServices() {
		System.out.println("Gynic Services  UsMedical");
	}

	//@Override
	public void Donations() {   //dupliacte methods can be written only once and it cant be overridden
		
		System.out.println("Donation Services- im duplicate method and cant be overriden");
		
	}

	@Override
	public void CoVid19Vaccaination() {
		
		
	}

	@Override
	public void CoVid19Research() {
		
	}

}
