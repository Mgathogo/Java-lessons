package brainFeed;

public class SwappingWords {
	//program to swap two strings without using third user defined variable

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		System.out.println("initial value of a is: "+a);
		System.out.println("\ninitial value of b is: "+b);
		
		a = a + b;
		
		b = a.substring(0, a.length()-b.length());
		
		System.out.println("\nThe modified value of b is: "+b);
		a = a.substring(b.length());
		System.out.println("\nThe modified value of a is: "+a);
		System.out.println("\nThe interchanged word is: "+a.concat(" ")+b);

	}

}
