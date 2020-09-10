package brainFeed;

import java.util.HashSet;

public class ArraySolution {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		filter(set);
		System.out.println("\n"+set);
	}

	public static void filter(HashSet<Integer> set) {
		int arr[] = {3, 1, 2, 5, 4, 4,3,9};
		for(int i=0; i<arr.length;i++) {
			set.add(arr[i]);
		}
	}

}
