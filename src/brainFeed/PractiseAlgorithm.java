package brainFeed;

public class PractiseAlgorithm {
	public String missingChar(String str, int n) {
		  
		  String front = str.substring(0, n);
		  
		  // Start this substring at n+1 to omit the char.
		  // Can also be shortened to just str.substring(n+1)
		  // which goes through the end of the string.
		  String back = str.substring(n+1, str.length());
		  
		  
		  return front + back;
		}

	public static void main(String[] args) {
		PractiseAlgorithm pa = new PractiseAlgorithm();
		String s = pa.missingChar("kitten", 3);
		
		System.out.println(s);
		
		int a = 89;

		  String str = Integer.toString(a);
		  System.out.println(str);
		
		
     
	}

}
