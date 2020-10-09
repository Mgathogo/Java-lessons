package brainFeed;

//Java program to find an element 
//such that sum of right side element 
//is equal to sum of left side 
public class ArrayCoding { 
	
	// Finds an element in an array such that 
	// left and right side sums are equal 
	static int findElement(int arr[], int n) {
		// Forming prefix sum array from 0 
		int[] prefixSum = new int[n]; 
		prefixSum[0] = arr[0]; 
		for (int i = 1; i < n; i++) 
			prefixSum[i] = prefixSum[i - 1] + arr[i]; //prefix starts at zero but moves to next, it is a variable
													  //arr[i] starts at one and adds to prefix, then prefix moves to arr[i]
		// Forming suffix sum array from n-1 
		int[] suffixSum = new int[n]; 
		suffixSum[n - 1] = arr[n - 1]; 
		for (int i = n - 2; i >= 0; i--) 
			suffixSum[i] = suffixSum[i + 1] + arr[i]; //suffix and arr[i] start at the end of element, suffix is then moved 
													  //to n-2 element and arr[i] moves left of suffix
		// Find the point where prefix and suffix 
		// sums are same. 
		for (int i = 1; i < n - 1; i++) 
			if (prefixSum[i] == suffixSum[i]) //prefix and suffix will follow the earlier declared elements positions
				return arr[i]; 
	
		return -1; 
	} 
	//You can reuse the method as many times with different arrays
	// Driver code 
	public static void main(String args[]) {
		int arr[] = { 1, 4, 2, 5 }; 
		int n = arr.length; 
		int arr1[] = {2,1,3,4,9,6,3,1};
		int len = arr1.length;
		System.out.println(findElement(arr, n)); 
		System.out.println(findElement(arr1, len));
	} 
} 
//This code is contributed by Michael Gathogo 

