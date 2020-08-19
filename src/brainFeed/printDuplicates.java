package brainFeed;

import java.util.Arrays;

public class printDuplicates {

	public static void main(String[] args) {
		int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }; 
		int key = 3;
		int []  results = printDuplicates.removeElements(array,key);
		System.out.println(Arrays.toString(results));
		
	}
	public static int[] removeElements(int[] arr, int key) {
		
		// return a new array except given key 
		return Arrays.stream(arr) 
			.filter(val -> val != key) 
			.toArray(); 

}
//	public void printResult(int [] arr ) {
//		System.out.println(arr+',');
//	}

}