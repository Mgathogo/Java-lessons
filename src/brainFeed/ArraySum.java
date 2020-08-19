package brainFeed;

public class ArraySum {

	public static void main(String[] args) {
		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int results =calculateSum(my_array);
		System.out.println(results);
//		System.out.println("\nRecursive method "+arraySum(my_array,0));
//		}
//	public static int arraySum(final int [] array, final int start) {
//		if(start >= array.length) return 0;
//		else
//			return array[start] + arraySum(array, start);
	}

	public static int calculateSum(int []my_array) {
		int sum = 0;
		for (int i : my_array) {
		    sum += i;
	}
	return sum;
		

	}

}

