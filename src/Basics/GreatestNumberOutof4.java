package Basics;

public class GreatestNumberOutof4 {

	public static void main(String[] args) {
		
		
		int a=110, b=100, c=60, d=70;
		
		/*&& is called conditional and and short ckt operator . I one of the condition is false 
		result is false*/
		
        if (a>=b && a>c && a>d)     // true && false && false= False
			System.out.println("a is greatest");
		else if(b>a && b>c && b>d)  //true && false && true =False
	        System.out.println("b is greatest");
		else if(c>a && c>b && c>d)  //true && true && true =True 
			System.out.println("c is greatest");
		else
		System.out.println("d is greatest");
			
        /*Nested If*/
	    if (a>b) {
	    	 if (a>c) { 
	    		if (a>d) {
	    			System.out.println("a is greatest");
	    		          }
	    		else 
	    	      {
	    		 System.out.println("c is the largest");
	    	      }
	    		  }
	              }
	    else if(b>c ){
	    	if (b>d) {
	    		System.out.println("b is largest");
	    	         }
	                 }
	        else {
	    	System.out.println("d is largest");
	        }
	    }    	
	}





