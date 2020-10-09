package brainFeed;

import java.util.StringTokenizer;

public class Asubstring {
//java program to demonstrate substring method and a Tokenizer class
	public static void main(String[] args) {
		
		String name = "Levi";
		
		
		String substring = name.substring(0, 4)+"-chege";
		System.out.println(substring);
		System.out.println("\n**************************************************");
		System.out.println("if you want to be a skilled developer do the following on a daily basis:\n");
		String myString ="practice=>mastery=>interest=>practice=>mastery=>interest!!";
		String delimeter = "=>";
		
		System.out.println("Have an inquisitive curiosity to understand how things work and =>\n");
		
		
		
		
		
		StringTokenizer tokens = new StringTokenizer(myString,delimeter);
		
				// .hasMoreTokens() method checks for more Tokens. 
				// Here not working as no Tokens left 
				while (tokens.hasMoreTokens()) 

					// .nextToken is method is returning next token. 
					System.out.print(tokens.nextToken("")); 
				System.out.println("\n\nAnd most of all have patience, Rome was not build in a single day!");
	}
	
}
//This code is shared to the public by Michael Gathogo