package Basics;

public class Gfg_Instance {
	
	int k;
	
	public Gfg_Instance(int k) {
		this.k=k;
	}
	
	public void setGFg() {
		this.k=k;
	}
	
	public int getK() {
		return k;
		
	}
	public static void main(String[] args) {
		
		Gfg_Instance gfg= new Gfg_Instance(10);
		
		System.out.println(gfg.getK());;
		
		
	}

}
