package brainFeed;

public class FindIndexLoop {
	public static int findIndex(int []arr, int num) {
		if(arr == null) return -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num)return i;

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	      System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
	      System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
	      System.out.println("Index position of 56 is: " + findIndex(my_array, 56));
	      System.out.println("Index position of 29 is: " + findIndex(my_array, 29));
	}

}
