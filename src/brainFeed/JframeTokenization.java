package brainFeed;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JframeTokenization {

	public static void main(String[] args) {
		Component frame = new JFrame();
	    // get text
	    String name = JOptionPane.showInputDialog(frame, "What's your name?");
	    System.out.println(name);
	    // split text when u get a space
	    List<String> list = Arrays.asList(name.split("\\p{Z}+"));
	    System.out.println(list);
	    
	    System.out.println("********************************************************");
	    
	    
	    /* A Java program to illustrate working of StringTokenizer 
	    class:*/
	    
	    System.out.println("Using Constructor 1 - "); 
        StringTokenizer st1 = 
             new StringTokenizer("Hello Geeks How are you", " "); 
        while (st1.hasMoreTokens()) 
            System.out.println(st1.nextToken()); 
  
        System.out.println("Using Constructor 2 - "); 
        StringTokenizer st2 =  
             new StringTokenizer("JAVA : Code : String", " :"); 
        while (st2.hasMoreTokens()) 
            System.out.println(st2.nextToken()); 
  
        System.out.println("Using Constructor 3 - "); 
        StringTokenizer st3 =  
             new StringTokenizer("JAVA : Code : String", " :",  true); 
        while (st3.hasMoreTokens()) 
            System.out.println(st3.nextToken()); 

	}

}
