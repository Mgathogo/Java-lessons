package brainFeed;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueSet {
	
	public static void main(String [] args) {
		var myname = "michael";
		System.out.println(myname);
		List<String> initialList = Arrays.asList("ebay", "paypal", "google", "ebay", "google", "paypay");
		System.out.printf("\nInitial list : %s%n",initialList);
	    sortList(initialList);
//		System.out.println("\nfrom method: "+result);
		
		//The sorList Method is declared once but runs both Hashset and TreeSet since they are both inside the method
		//curly braces. The return method makes it possible cause the method is not returning a value
		//see SetArralyList.java class
		
	}

	public static List<String> sortList(List<String> myList) { // you can substitute List with void
		Set<String> hashsetList = new HashSet<>(myList);
		System.out.printf("\nUnique value using Hashset: %s%n",hashsetList );
		
		Set<String> treesetList = new TreeSet<>(myList);
		System.out.printf("\nUnique value using Treeset: %s%n",treesetList );
		return myList;
		
	}
	

}
//See class SetArraList.java for Integers
