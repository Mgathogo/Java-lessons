package brainFeed;

import java.sql.Date;
import java.time.LocalDateTime;

//Java program to remove punctuation from a given string 

public class Test 
{ 
	public static void main(String[] args) 
	{ 
		// input string 
		String str = "Welcome???@@##$ to#$% Masai%$^mara$%^&Park"; 
		String name = "Michael";
		String modified = name.substring(1) + name.charAt(0);
		System.out.println(modified);
		
		// similar to Matcher.replaceAll 
		str = str.replaceAll("\\p{Punct}",""); 
		
		System.out.println(str); 
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	} 
//	public static int count(String [] words, int count) {
//		for(int i=0; i< words.length; i++) {
//			if(words[i]==)
//		}
//	}
	
} 
//This code is contributed by Gaurav Miglani 
