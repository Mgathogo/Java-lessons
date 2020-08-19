package brainFeed;

public class Palindrome {
	 public static void main(String[] args)
	    {
	        String originalString = "abcdcba";
	         
	        boolean isPalindrame = isBool(originalString);
	        
	       System.out.println(isPalindrame);    
	    }

	public static boolean isBool(String originalString) {
		StringBuilder strBuilder = new StringBuilder(originalString);
		String reverseString = strBuilder.reverse().toString();
 
		 
      boolean isPalindrame = originalString.equals(reverseString);
		return isPalindrame;
	}

}
