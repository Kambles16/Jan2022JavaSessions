/**
 * 
 */
package oop_Abstraction;

public interface UkMedical extends WHO { // interface will have parent interface only it cant have class as a parent

	public void entServices();

	public void CardiacServices();

	public void orthoServices();

	public void Donations();

	void BillingServices();

	public void CoVid19Vaccaination();

	public void CoVid19Research();

	// private void donationServices(); can't write peivate method ; as we cant
	// access in child class and cant write implimentation ; so no use

	// Default donation();

}
