package brainFeed;

//Java program for implementation of Selection Sort 
class SelectionSort 
{ 
	void sort(int arr[]) { 
	
		int n = arr.length; 

		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) {//When targeting all the element the last one is -1 but for size just length 
		 
			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; ++j)//J starts at index 1 all the way to the last element 
				if (arr[j] < arr[min_idx])
					min_idx = j; 
			//System.out.println("min_index is "+min_idx);

			// Swap the found minimum element with the first 
			// element. A new loop starts and i is back to zero and the comparison starts
			//variable min_indx is just for allocating i as the mean index before finding actual mean index
			//when you find it, you assign the actual mean index. The smallest value in the array, it's index
			//becomes the least index and it is assigned the title of min_idx, then it is legible to be moved
			//to the correct position
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

