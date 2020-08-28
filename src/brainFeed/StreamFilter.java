package brainFeed;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class StreamFilter {

	
		public static void main(String[] args) {
            List<String> myList = Arrays.asList("d1", "b2", "e1", "a2", "a1", "b1", "c2", "c1", "c3");
            Optional<String> result = myList.stream().filter(s -> s.startsWith("z")).findFirst();
            String list = result.orElse("No such record found! What a bummer!");
            System.out.println(list);
            
            
            
        }
//		List<String> items;
//		String prefix;
//		List<String> filteredList = items.stream().filter(e -> (!e.startsWith(prefix))).collect(Collectors.toList());
//		
		//filtering by skipping the entries that starts with a certain prefix and putting the rest into a collection

		
	}


