
public class swapTwoNumbers {

	public static void main(String[] args) {
		SwapTwoNum(10, 20);
		

	}
	public static void SwapTwoNum(int a, int b) {
		int temp;
		
		temp= b;  // temp=20
		b=a;     //b=10
		a=temp; //a=20
		
		System.out.println(a +" and "+ b +" Ater swap " );
		
	}

}
