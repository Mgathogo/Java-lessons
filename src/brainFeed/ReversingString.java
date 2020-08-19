package brainFeed;

public class ReversingString {

	public static void main(String[] args) {
		String str = "Michael";
		String replace= "";
		
		for(int i=str.length()-1; i>=0; i--) {
			replace += str.charAt(i);
			
		}
		System.out.println("\nReversed string is "+ replace);
		
		// Java program to demonstrate working of split(regex, 
		// limit) with small limit. 
		 
			System.out.println("****************************************************");
				String str1 = "geekss@for@geekss"; 
				String[] arrOfStr = str1.split("@", 3); 

				for (String a : arrOfStr) {
					System.out.println(a); 
			} 
				System.out.println("****************************************************");
				String str2 = "word1, word2 word3@word4?word5.word6"; 
		        String[] arrOfStr1 = str2.split("[, ?.@]+"); 
		  
		        for (String a : arrOfStr1) 
		            System.out.println(a);
		} 


	}


