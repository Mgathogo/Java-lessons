package brainFeed;
//Java program to Convert a String 
//to a Character array using Naive Approach  

public class StringToChar { 

	public static void main(String args[]) 
	{ 
		String str = "GeeksForGeeks"; 
		//char[] ch1 =str.toCharArray();

		// Creating array of string length 
		char[] ch = new char[str.length()]; 

		// Copy character by charcter into array 
		System.out.println("So cool!\n");
		for (int i = 0; i < str.length(); i++) { 
			ch[i] = str.charAt(i);
			//ch1[i] = str.charAt(i);
			
			System.out.print(ch[i]+"-"); 
		} 

		// You can use for each as well, it is better and simpler 
//		for (char c : ch) { 
//			System.out.println(c); 
//		} 
	} 
} 

