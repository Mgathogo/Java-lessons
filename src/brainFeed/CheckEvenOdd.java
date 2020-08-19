package brainFeed;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] Integer ) {
		
		    evenOdd();
		  }

	public static int evenOdd( ) {
		System.out.println("Enter an Integer number:");
		Scanner input =new Scanner(System.in);
		int num = input.nextInt();

		/* If number is divisible by 2 then it's an even number
		 * else odd number*/
		if ( num % 2 == 0 )
		    System.out.println("Entered number is even");
		 else
		    System.out.println("Entered number is odd");
		input.close();
		return num;
	}
	

	}



