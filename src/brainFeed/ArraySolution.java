package brainFeed;
//java program to filter out duplicates and to maintain order using set Interface
//with its concrete class HashSet
import java.util.HashSet;
import java.util.Set;

public class ArraySolution {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		filter(set);
		System.out.println("\n"+set);
	}

	public static void filter(Set<Integer> set) {
		int arr[] = {3, 1, 2, 5, 4, 4,3,9};
		for(int i=0; i<arr.length;i++) {
			set.add(arr[i]);
		}
	}

}
