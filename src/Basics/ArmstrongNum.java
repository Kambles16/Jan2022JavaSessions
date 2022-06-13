package Basics;

public class ArmstrongNum {  //sum of cubes of digits=same number

	public static void isArmStrongNum(int num) {     //153= 1*1*1+5*5*5+3*3*3 cal starts from 3 for arm
		System.out.println("given num is "+ num );
		
		int cube=0;
		int t;
		int r;
		t= num;
		
		while(num>0) {
			r= num%10;  //153%10; remainder will be 3, 5 ,1
			num=num/10;   //153/10; o/p num=15 ;num=1
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("given number is armstrong number");
		}else
			System.out.println("number is not an armstrog number");
		
	}
	
	
	public static void main(String[] args) {
		isArmStrongNum(153);
		isArmStrongNum(500);

	}

}
