package brainFeed;

import java.util.ArrayList;
import java.util.HashMap;
// This is a data class, providing data for TestingHashmap class making it modular

public class HashmapData {
	
	public static HashMap<String, Integer> showdata() {
		HashMap<String, Integer> map = new HashMap<>();

	    map.put("first", 10000);
	    map.put("second", 20000);
	    map.put("third", 300);
	    map.put("fourth", 800012);
	    map.put("fifth", 5000);
	    map.put("sixth", 30012);
	    map.put("seventh", 1234);
	    map.put("eighth", 45321);
	    map.put("nineth", 5678);
		return map;
	}
	public static int maximum(HashMap<Integer,String> hashMap) {
		  new HashMap<>();
      hashMap.put(1, "apple");
      hashMap.put(67, "banana");
      hashMap.put(46, "orange");
      hashMap.put(9, "mango");
      hashMap.put(56, "grapes");
      hashMap.put(564, "pomogranet");
      hashMap.put(646, "papaya");
      hashMap.put(466, "watermelon");
      ArrayList<Integer> al = new ArrayList<>();
      for (Integer m : hashMap.keySet()) {
          al.add(m);
      }
      int max = 0;//The value at zero index 
      for (int i=0; i<al.size();i++) {
          if (al.get(i)> max) {
              max = al.get(i);
          }
      }
      return max;
	}

}
