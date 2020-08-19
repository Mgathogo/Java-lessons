package brainFeed;

//Java program to reverse a string using recursion 

class StringReverse 
{ 
	/* Function to print reverse of the passed string */
	void reverse(String str) {
	 
		if ((str==null)||(str.length() <= 1)) 
		System.out.println(str);//this is needed for else statement to work 
		else {
			System.out.print(str.charAt(str.length()-1)); //checking if condition, if true proceed from last char
			reverse(str.substring(0,str.length()-1)); //every string is independent and char 0 is targeted
		} 
	} 
	
	
	/* Driver program to test above function */
	public static void main(String[] args) 
	{ 
		String str = "revihca remmargorp llufsseccuS a leahciM"; 
		StringReverse obj = new StringReverse(); 
		obj.reverse(str); 
	}	 
} 

