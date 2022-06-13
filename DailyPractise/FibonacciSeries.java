
public class FibonacciSeries {

	public static void main(String[] args) {
		//int[] arr={0,1,1,2,3,5,8};
		getFibonacciSeries(10);
		
	}
	
	public static void getFibonacciSeries(int n) {
		int firstNum=0; int secondNum=1;
		
		for(int i=1; i<=n; i++) {
			System.out.print(firstNum + " , ");
			
			int nextNum= firstNum + secondNum; //0+1
			firstNum=secondNum;  //f=1
			secondNum =nextNum ;//s=1
			
		}
		
		
	
	}

}
