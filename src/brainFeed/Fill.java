package brainFeed;
//Java program to fill a subarray array with 
//given value. 
import java.util.Arrays; 

public class Fill {
 
	public static void main(String[] args) 
	{ 
		int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2}; 

		// Fill from index 1 to index 4. 
		Arrays.fill(ar, 1, 5, 10); 
	
		System.out.println("Single array"+Arrays.toString(ar)); 
		System.out.println("");
		
		 int [][]ar1 = new int [3][4]; 
		  
	        // Fill each row with 10.  
	        for (int[] row : ar1) 
	            Arrays.fill(row, 10); 
	     
	        System.out.println("Multidimensional array"+Arrays.deepToString(ar1));
	} 
} 

