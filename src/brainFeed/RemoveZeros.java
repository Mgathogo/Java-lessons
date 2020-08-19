// Java program to remove leading/preceding zeros 
// from a given string 
package brainFeed; 

/* Name of the class to remove leading/preceding zeros */
class RemoveZeros 
{ 
	public static String removeZero(String str) {
		
		if(str==null || str.isEmpty()) {
			return str;
		}
	 
		// Count leading zeros 
		int i = 0; 
		while (str.charAt(i) == '0') 
			i++; 
	   //System.out.println("\nnumber of zeros is "+i);
		

		// Convert str into StringBuffer as Strings 
		// are immutable. 
		StringBuffer sb = new StringBuffer(str); 
		System.out.println("\nBefore taking out zeros  "+str);

		// The StringBuffer replace function removes 
		// i characters from given index (0 here) 
		sb.replace(0, i, "$"); 

		return sb.toString(); // return in String 
	} 

	// Driver code 
	public static void main (String[] args) 
	{ 
		String str = "00000000000000123569";
		
		str = removeZero(str); 
		System.out.println("\nAfter taking out zeros: " +str); 
		
	} 
} 
