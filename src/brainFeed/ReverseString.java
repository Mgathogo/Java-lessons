package brainFeed;

import java.util.Scanner;

public class ReverseString {
	  public static void main(String[] args) {
	    
	        System.out.println("Enter string to reverse:");
	        
	        Scanner read = new Scanner(System.in);
	        String str = read.nextLine(); //this is a method to tap in to the variable
	        String reverse = "";
	        
	        
	        for(int i = str.length() - 1; i >= 0; i--) {
	        
	            reverse +=str.charAt(i);
	        }
	        
	        System.out.print("Reversed string is: ");
	        System.out.println(reverse);
	        
	        read.close();
	       
	    }
	  

	  
}
