package brainFeed;

public class InsertingString {
	public static String insertString( 
	        String originalString, 
	        String stringToBeInserted, 
	        int index) {
	     
	  
	        // Create a new string 
	        String newString = new String(); 
	  
	        for (int i = 0; i < originalString.length(); i++) { 
	  
	            // Insert the original string character 
	            // into the new string 
	            newString += originalString.charAt(i); //inserting character by character into new string
	  
	            if (i == index) { 
	  
	                // Insert the string to be inserted 
	                // into the new string 
	                newString += stringToBeInserted; 
	            } 
	        } 
	        System.out.println("Length of new string: "+newString.length()+ " characters");
	  
	        // return the modified String 
	        return newString; 
	    } 
	  

	public static void main(String[] args) {
		// Get the Strings 
        String originalString = "MasaiMara"; 
        String stringToBeInserted = "For"; 
        int index = 4; 
  
        System.out.println("\nOriginal String: "
                           + originalString+"\n"); 
        System.out.println("String to be inserted: "
                           + stringToBeInserted); 
        System.out.println("String to be inserted at index: "
                           + index); 
  
        // Insert the String 
        System.out.println("Modified String: "
                           + insertString(originalString, 
                                          stringToBeInserted, 
                                          index)); 

	}

}
