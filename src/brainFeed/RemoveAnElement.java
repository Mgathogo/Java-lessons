package brainFeed;
import java.util.Arrays;

public class RemoveAnElement {
	// function to remove all occurrences 
		// of an element from an array 
		public static int[] removeElements(int[] arr, int key) {
		
			// return a new array except given key 
			return Arrays.stream(arr) 
				.filter(val -> val != key) 
				.toArray(); 
		} 

	public static void main(String[] args) {
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   
		   System.out.println("\nOriginal Array : "+Arrays.toString(my_array));     
		   
		  // Remove the second element (index->1, value->14) of the array
		   int removeIndex = 4;

		   for(int i = removeIndex; i < my_array.length -1; i++){
		        my_array[i] = my_array[i + 1];
		      }
		// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
		    System.out.println("\nAfter removing the second element: "+Arrays.toString(my_array));
		    
		    System.out.println("*********************************************************************************");
		 // Get the array 
			int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }; 
			System.out.println("\nBefore removing occurence of three: "+Arrays.toString(array));

			// Get the key 
			int key = 3; 

			// Remove the key 
			array = removeElements(array, key); 

			// Print the modified array 
			System.out.println("\nAfter removing occurence of three: "+Arrays.toString(array)); 
		 }
	}


