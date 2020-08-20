package brainFeed;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamFilter {

	  LocalDateTime now = LocalDateTime.now();
	
	
		public static void main(String[] args) {
            List<String> myList = Arrays.asList("d1", "b2", "e1", "a2", "a1", "b1", "c2", "c1", "c3");
            Optional<String> result = myList.stream().filter(s -> s.startsWith("z")).findFirst();
            String list = result.orElse("\nNo such record found! What a bummer!\n");
            System.out.println(list);
            
            
         // Creating an integer array 
            int arr[] = { 1, 2, 3, 4, 5 }; 
      
            // Using Arrays.stream() to convert 
            // array into Stream 
            IntStream stream = Arrays.stream(arr); 
      
            // Displaying elements in Stream 
            stream.forEach(str -> System.out.print(str + " "));
        }
//		List<String> items;
//		String prefix;
//		List<String> filteredList = items.stream().filter(e -> (!e.startsWith(prefix))).collect(Collectors.toList());
//		
		//filtering by skipping the entries that starts with a certain prefix and putting the rest into a collection

		
	}


