package brainFeed;
import java.util.Arrays; 

//Java program for implementation of Bubble Sort 
class BubbleSort 
{ 
	static void bubbleSort(int arr[]) {
		int n = arr.length; 
		for (int i = 0; i < n-1; i++)//general direction of i to the right, no curly braces 
			for (int j = 0; j < n-i-1; j++) //Highest number pushed to the right, then process repeats again
				if (arr[j] > arr[j+1]) {
				 
					// swap arr[j+1] and arr[i] 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
	} 

	/* Prints the array */
	static void printArray(int arr[], int n) { 
	 
		for (int i=0; i<n; ++i)
			//this is the one
			System.out.print(arr[i] + " "); 
		System.out.println();
		Arrays.sort(arr);
		//System.out.printf("Sort Modified arr[] : %s",
		System.out.print("\nUsing provided sort method in java: ");
		
               System.out.println(Arrays.toString(arr));
	} 

	// Driver method to test above 
	public static void main(String args[]) {
	
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		bubbleSort(arr); 
		System.out.print("Using Bubble sort method: "); 
		
		BubbleSort.printArray(arr, arr.length);
		System.out.println();
		 
	} 
} 
/* This code is contributed by Michael Gathogo */

