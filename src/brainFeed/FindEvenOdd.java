package brainFeed;

import java.util.Random;

public class FindEvenOdd {
	public static void  EvenOdd(int num) {
		if(num % 2 ==0) {
			System.out.println(num+" is even random generated number");
		}else {
			System.out.println(num+" is odd random generated number");
		}
	}
	public static boolean isEven(int num) {
		if(num % 2==0) return true;
	     else 
		return false ;
}
	

	public static void main(String[] args) {
		Random objGenerator = new Random();
        for (int iCount = 1; iCount<= 2; iCount++){
          int randomNumber = objGenerator.nextInt(100);
		EvenOdd(randomNumber);
		boolean result = isEven(randomNumber);
		System.out.println(result);

}
}
}