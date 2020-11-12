package brainFeed;

public class ByteReverse {

	public static void main(String[] args) {
		String str = "leahciM-lufsseccuS & desselB";
		String str1 = "!si ti retniw dloc";
		System.out.println(reverseByte(str));
		System.out.println(reverseByte(str1));
	}

	public static String reverseByte(String str) {
		byte [] strArr =str.getBytes();
		int len = strArr.length;
		byte [] results = new byte[str.length()];
		for(int i=0; i<len; i++) {
			results[i] = strArr[len-i-1];//The minus i and 1 is for targeting the last element and moving to left
		}
		return new String(results);
	}

}

//Practice using a return method to solve above problem
