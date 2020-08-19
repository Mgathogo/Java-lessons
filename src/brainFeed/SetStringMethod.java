package brainFeed;
import java.lang.reflect.Array;

public class SetStringMethod {
	// main method 
    public static void main(String[] args) 
    { 
  
        // Declaring and defining a String array 
        String s[] = { "Geeks", "is", "Geeks" }; 
  
        System.out.print("\nBefor Set : "); 
        // printing the array 
        for (String x : s) { 
            System.out.print(x); 
        } 
  
        // set method of class Array 
        Array.set(s, 1, "for"); 
  
        System.out.print("\nAfter Set : "); 
        // printing array 
        for (String x : s) { 
            System.out.print(x); 
        } 
    } 

}
