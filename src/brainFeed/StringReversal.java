package brainFeed;

public class StringReversal {
	public static String reverse(String str) {
		if(str==null || str.isEmpty()) {
			return str;
		}
		char[]characters = str.toCharArray();
		int i = 0;
		int j = characters.length - 1;
		while(i<j) {
			swap(characters, i, j);
			i++;
			j--;
		}
		return new String(characters);
		
	}
	private static void swap(char[]str, int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}
	
	

	public static void main(String[] args) {
		System.out.println("Prediction made on: 03-16-2020");
		System.out.println(reverse("!erutuf raen eht ni yad emos yrettol topakcaj a niw lliw ogohtaG leahciM"));

	}

}
