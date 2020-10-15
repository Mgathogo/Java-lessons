package brainFeed;
//java program to find if a random generated number is even or odd
import java.util.Random;

public class FindEvenOrOdd {
	public static void  isEvenOrSOdd(int num) {
		if(num % 2 ==0) {
			System.out.println(num+" is an even random generated number.");
		}else {
			System.out.println(num+" is an odd random generated number.");
		}
	}
	public static boolean isEven(int num) {
		if(num % 2==0) 
			return true;
	     else 
		return false;
}
	
   //Driver main
	public static void main(String[] args) {
		Random objGenerator = new Random();
        for (int times = 1; times<= 2; times++){
          int randomNumber = objGenerator.nextInt(100);//up to a hundred random numbers
          isEvenOrSOdd(randomNumber);
		boolean result = isEven(randomNumber);
		System.out.println(result);

}
}
}