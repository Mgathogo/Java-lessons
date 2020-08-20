package brainFeed;

public class ByteReverse {

	public static void main(String[] args) {
		String str = "!!!leahciM-lufsseccuS & desselB";
		String str1 = "!si ti retniw dloc";
		System.out.println(reverseByte(str));
		System.out.println(reverseByte(str1));
	}

	public static String reverseByte(String str) {
		byte [] strArr =str.getBytes();
		byte [] results = new byte[str.length()];
		for(int i=0; i<strArr.length; i++) {
			results[i] = strArr[strArr.length-i-1];//The minus i is for moving elements from left 
		}
		return new String(results);
	}

}

//Practice using a return method to solve above problem
