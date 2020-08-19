package brainFeed;

public class CountAlphabet {

	public static void main(String[] args) {
	int	result = countAlphabet("Pizzzza", 'z');
	System.out.println("Pizza has: "+result+" Z characters");
	String replaceChar = replaceCharUsingCharArray("Pizza",'A',3);
	System.out.println(replaceChar);
	System.out.println(replaceChar("Manhattan", 'A',4));
	
		
		}
	public static int countAlphabet(String word, char alphabet) {
		int count = 0;
		
		char [] characters = word.toCharArray();
		
		for(char c : characters ) {
			if(c == alphabet) 
			count++;
			
		}
		return count;

	}
	//java program to replace a character at a specific index
	public static String replaceCharUsingCharArray(String str, char ch, int index) {
	    char[] chars = str.toCharArray();
	    chars[index] = ch;
	    return String.valueOf(chars);
	}
	public static String replaceChar(String str, char ch, int index) {
	    return str.substring(0, index) + ch + str.substring(index+1);
	}
	        	
		
	    
	    
	}
	


