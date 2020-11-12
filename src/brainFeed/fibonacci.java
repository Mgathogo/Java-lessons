package brainFeed;

//Java program to demonstrate Fibonacci algorithm using Recursion using ternary

public class fibonacci{ 
	static int fib(int n) {
	return n <= 1 ? n : fib(n-1) + fib(n-2); 
	
	} 
	
	public static void main (String args[]) {
	int n = 9; 
	System.out.println(fib(n)); 
	} 
} 
/* This code is contributed by Michael Gathogo */

