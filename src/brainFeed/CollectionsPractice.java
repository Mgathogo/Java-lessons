package brainFeed;

import java.util.HashMap;

//Pulling data from HashMapData class to run this main method
//The class to check even or odd is modular and can be run in a diff class

public class CollectionsPractice {
	

	public static void main(String[] args) {
		CheckEvenOdd.evenOdd();
		HashMap<Integer,String> map = new HashMap<>();
		
		int max =HashmapData.maximum(map);	 
	         System.out.println("max: "+max);
	         
	         System.out.println(max + "--->" +map.get(max));
	         
	    }
	

	}


