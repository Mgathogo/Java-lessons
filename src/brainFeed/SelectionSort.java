package brainFeed;

//Java program for implementation of Selection Sort 
class SelectionSort 
{ 
	void sort(int arr[]) { 
	
		int n = arr.length; 

		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) {//When targeting all the element the last one is -1 but for size just length 
		 
			// Find the minimum element in unsorted array 
			int min_idx = i, j=i+1; 
			for ( j = i+1; j < n; ++j)//J starts at index 1 all the way to the last element 
				if (arr[j] < arr[min_idx])
					min_idx = j; 
			//the inner loop checks for the minimum index all the way to the end, then it swaps with the current min index
			//then i is incremented, then the inner loop starts again and the whole process starts again until i reaches n-1
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	} 

	// Prints the array 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver code to test above 
	public static void main(String args[]) 
	{ 
		SelectionSort ob = new SelectionSort(); 
		int arr[] = {64,25,12,22,11}; 
		ob.sort(arr); 
		System.out.print("Sorted array is: "); 
		ob.printArray(arr); 
	} 
} 
/* This code is contributed by Michael Gathogo*/

