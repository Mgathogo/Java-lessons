package brainFeed;
import java.util.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7};
		int len = numbers.length;
		int [] result =reverse(numbers,len);
		System.out.println(Arrays.toString(result));

	}
	public static int [] reverse(int[]input, int length) {
		System.out.println("\nOriginal array: "+ Arrays.toString(input)+"\n");
		
		//handling null, empty and one element array, n is the length
		if(input==null || length <=1 ) {
			return input;
		}
		for(int i=0; i < length/2; i++) {
			int temp = input[i];
			input[i] = input[length - 1 - i];//-i is for moving to the left, -1 is targeting last element
			input[length - 1 - i] = temp;
		}
		return input;
		
		//System.out.println("\nreversed array : " + Arrays.toString(input));
	}

}
// code contributed by Michael Gathogo
