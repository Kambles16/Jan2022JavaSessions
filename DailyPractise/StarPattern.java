
public class StarPattern {
	/*1                
	*
	**
	***
	****
	*****
	*/

	public static void main(String[] args) {
//         for (int i = 0; i <= 4; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//    System.out.println("=============================");     
  /*
    *****
    ****
    ***
    **
    *
    */
//    
//    for(int k= 0; k<= 4; k++) {
//    	for(int m=4; m>=k ;m--) {
//    		System.out.print("*");
//    	}
//    	System.out.println();
//    }
	
	
	
//	for(int i=1; i<= 4; i++) {
//		for (int j=3; j>=i; j--) {
//			System.out.print("-");
//		}
//		 for(int k=1; k<=i; k++) {
//			System.out.print("*");
//		 }
//			 System.out.println();
//	}
//
		
		for (int i=1; i<=4; i++) {
			for(int j=1; j>=i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
}
}
