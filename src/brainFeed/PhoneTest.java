package brainFeed;

import java.util.ArrayList;

public class PhoneTest {
	// String array to store keypad characters 
		static final String codes[] 
			= { " ", "abc", "def", 
				"ghi", "jkl", "mno", 
				"pqr", "stu", "vwx", 
				"yz" }; 

		// Function that returns an Arraylist 
		// which contains all the generated words 
		public static ArrayList<String> printKeyWords(String digits) {
			// If digits is empty 
			ArrayList<String> baseRes = new ArrayList<>();
			if(digits.isEmpty()) return baseRes;
			
				// Return an ArrayList containing 
				// empty string 
				
			 

			/// First character of str.   
			char ch = digits.charAt(0); 
			//System.out.println(ch);

			// Rest of the characters of str 
			String restStr = digits.substring(1);
			System.out.println(restStr);

			ArrayList<String> prevRes = printKeyWords(restStr);
			System.out.println("I am lokking for"+prevRes);
			ArrayList<String> Res = new ArrayList<>(); 

			String code = codes[ch - '0']; //code is only storing  
			System.out.println("this is the code: "+code);							  //to find the index of the phone letters
										   
			for (String val : prevRes) { 
				System.out.println("what is this: " +val);
				for (int i = 0; i < code.length(); i++) { 
					Res.add(code.charAt(i) + val); 
					//System.out.println("the first "+code.charAt(i));
					
				} 
			} 
			return Res; 
		} 

		// Driver code 
		public static void main(String[] args) 
		{ 
			String str = "23"; 

			// Print all the possible words 
			System.out.println(printKeyWords(str)); 
		} 
	} 

