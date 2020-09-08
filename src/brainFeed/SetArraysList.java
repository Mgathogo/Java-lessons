package brainFeed;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetArraysList {

	public static void main(String[] args) {
		List<Integer> arrays = Arrays.asList(4,5,6,7,7,4,5);
		filteredElements(arrays);
		

	}

	public static Set<Integer> filteredElements(List<Integer> myArr) {
		Set<Integer> hashsetList = new HashSet<>(myArr);
		//System.out.printf("\nUnique value using Hashset: %s%n",hashsetList );
		System.out.println("\n"+hashsetList);
		return hashsetList;
	}
	

}

//Practice this using the return key word