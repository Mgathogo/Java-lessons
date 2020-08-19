package brainFeed;
//java program to print all possible by pressing a number
//Java implementation of the approach 
import java.util.ArrayList; 

public class PhoneLetters { 

	// String array to store keypad characters 
	static final String codes[] 
		= { " ", "abc", "def", 
			"ghi", "jkl", "mno", 
			"pqr", "stu", "vwx", 
			"yz" }; 

	// Function that returns an Arraylist 
	// which contains all the generated words 
	public static ArrayList<String> printKeyWords(String str) {
		// If str is empty 
		if (str.length() == 0) { 
			ArrayList<String> baseRes = new ArrayList<>(); 
			//System.out.println(" this" +baseRes);
			baseRes.add("");
			//System.out.println("list"+baseRes);

			// Return an Arraylist containing 
			// empty string 
			return baseRes; 
		} 

		// First character of str.   
		char ch = str.charAt(0); 
		//System.out.println(ch);

		// Rest of the characters of str 
		String restStr = str.substring(1);
		//System.out.println("This"+restStr);

		ArrayList<String> prevRes = printKeyWords(restStr);
		System.out.println("I am lokking for"+prevRes);
		ArrayList<String> Res = new ArrayList<>(); 

		String code = codes[ch - '0']; //code is only storing  
		//System.out.println("this is the code: "+code);							  //to find the index of the phone letters
									   
		for (String val : prevRes) { 
			//System.out.println("what is this: " +val);
			for (int i = 0; i < code.length(); i++) { 
				Res.add(code.charAt(i) + val); 
				//System.out.println("the first "+code.length());
				
			} 
		} 
		return Res; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String str = "231"; 

		// Print all the possible words 
		System.out.println(printKeyWords(str)); 
	} 
} 

