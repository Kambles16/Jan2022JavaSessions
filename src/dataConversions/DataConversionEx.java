package dataConversions;

public class DataConversionEx {

	public static void main(String[] args) {
		
		String i="100";
		int j=10;
		System.out.println(i+j);// 10010
		
		int k=Integer.parseInt(i);//Integer is a wrapper class and ParseInt is a static method 
		System.out.println(k);
	    System.out.println(k+j);
	    
	    String b= "true";
	    boolean bb =  Boolean.parseBoolean(b);//Boolean is a wrapper class
	    System.out.println(bb);
		
	    String Str="10.0d";
	    double d = Double.parseDouble(Str);
	    System.out.println(d);
	
	    int a= 10;
	    Integer s= Integer.valueOf(a);
	    System.out.println(s);
	    
	    double dd= Double.valueOf(Str);//
	    System.out.println(dd);
	    
	    String ss="AA100";  
	//  int z= Integer.parseInt(ss);  //as the string is alphanumeric value when u try to convert it gives Number Format exception
	    
	    int lengthOfStr=ss.length();  //5
	    System.out.println(lengthOfStr);
	    StringBuffer alpha=new StringBuffer();//classes two crate mutable strings
	    StringBuffer num =new StringBuffer(); 
	    for(int l=0; l<lengthOfStr ;l++) {
	    	
	            if(Character.isDigit(ss.charAt(l))) //character is a class
				num.append(ss.charAt(l));
			    else {
				alpha.append(ss.charAt(l));
	    		}
	    }
	     System.out.println(num);
	     System.out.println(alpha);
	  	}
}
