package brainFeed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestingHashmap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map =HashmapData.showdata();
		
	    
	    List<Entry<String, Integer>> list = sort(map);
	    System.out.println(list.subList(0, 5));
	    System.out.println(list);

//	    Set<Entry<String, Integer>> set = map.entrySet();
//
//	    List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
//	            set);
//
//	    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//
//	        @Override
//	        public int compare(Entry<String, Integer> o1,
//	                Entry<String, Integer> o2) {
//
//	            return o2.getValue().compareTo(o1.getValue());
//	        }
//
//	    });
//	    System.out.println(list.subList(0, 5));
//	    System.out.println(list);
	        
	        

	}
	public static List<Entry<String, Integer>> sort(HashMap<String, Integer> map){
		Set<Entry<String, Integer>> set = map.entrySet();

	    List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
	            set);

	    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

	        @Override
	        public int compare(Entry<String, Integer> o1,
	                Entry<String, Integer> o2) {

	            return o2.getValue().compareTo(o1.getValue());
	        }
	    });
	    
        return  list;
              
}
}