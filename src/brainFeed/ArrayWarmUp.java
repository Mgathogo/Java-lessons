package brainFeed;

public class ArrayWarmUp {
	public String everyNth(String str, int n) {
		  String result = "";
		  
		  // Look at every nth char
		  for (int i=0; i<str.length(); i = i + n) {
		    result +=str.charAt(i);
		  }
		  return result;
		}

	public static void main(String[] args) {
		ArrayWarmUp awu = new ArrayWarmUp();
		String result = awu.everyNth("FiuhjeigAgpgpjlle", 2);
		System.out.println(result);

	}

}
