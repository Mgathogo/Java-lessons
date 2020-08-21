package brainFeed;
import java.util.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7};
		int [] result =reverse(numbers);
		System.out.println(Arrays.toString(result));

	}
	public static int [] reverse(int[]input) {
		System.out.println("\nOriginal array: "+ Arrays.toString(input)+"\n");
		
		//handling null, empty and one element array
		if(input==null || input.length <=1 ) {
			return input;
		}
		for(int i=0; i < input.length/2; i++) {
			int temp = input[i];
			input[i] = input[input.length - 1 - i];//-i is for moving to the left, -1 is targeting last element
			input[input.length - 1 - i] = temp;
		}
		return input;
		
		//System.out.println("\nreversed array : " + Arrays.toString(input));
	}

}
// code contributed by Michael Gathogo
