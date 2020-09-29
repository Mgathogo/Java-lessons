package brainFeed;
//java program to demonstrate factorial recursive using ternary and regular if statement
public class FactorialRecursive {
	public static int factorialRecursive( int n ) {
	    return n == 1 ? 1 : n * factorialRecursive( n-1 );
	}
	public static int factorial(int n) {
		if(n==1) return 1;
		return  n * factorial(n-1);
	}
	public static void main (String[]args) {
		System.out.println("Ternary if statement: "+factorialRecursive(3));
		System.out.println("Regular if statement: " +factorial(7));
	}
	
	

}
