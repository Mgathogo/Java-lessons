package brainFeed;

import java.util.HashSet;

public class UniqueElements {
	// This function prints all distinct elements 
    static  HashSet<Integer> printDistinct(int arr[]) {
     
        // Creates an empty hashset 
        HashSet<Integer> set = new HashSet<>();
   
        // Traverse the input array, no need to check if set contains num
        for (Integer num: arr) {
        
            	set.add(num); 
             
        }
        
      return set;
    } 
	

 // Driver method to test above method 
    public static void main (String[] args)  {
    	
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        
        HashSet<Integer> result = printDistinct(arr);
       
        System.out.println(result); 
        
        
        
    } 

}
