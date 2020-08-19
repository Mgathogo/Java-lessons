package brainFeed;
import java.util.Arrays;

import java.util.List;

public class AsList {
	
	public static void main(String[] argv) 
	        throws Exception 
	    { 
	  
	        try { 
	   
	            List<Integer> list =getList(); 
	            System.out.println(list);
	        } 
	  
	        catch (NullPointerException e) { 
	            System.out.println("Exception thrown : " + e); 
	        } 
	    }

	public static List<Integer> getList() {
		// creating Arrays of Integer type 
		Integer a[] = new Integer[] { 10, 20, 30, 40 }; 
  
		// getting the list view of Array 
		List<Integer> list = Arrays.asList(a); 
  
		// printing the list 
		
		//System.out.println("The list is: " + list);
		return list;
	} 

}//practice on creating a dynamic method
