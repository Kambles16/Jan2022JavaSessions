package Basics;

public class missingNumberArray {

	public static void main(String[] args) {
		
        int ar[]= {3,2,4,5,1};
		
		int n1= findMissingNumber(ar, 6);
		System.out.println(n1);
	}
	
	public static int findMissingNumber(int num[], int totalNuminArray) {
		
		int expSum= totalNuminArray*(totalNuminArray+1)/2;
		int actSum=0;
		
		for(int i : num ) {
			actSum +=i;
		}
		return expSum-actSum;
	}

}
