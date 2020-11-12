package brainFeed;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueSet {
	
	public static void main(String [] args) {
		var myname = "michael";
		System.out.println(myname+"\n");
		String [] appsArr = {"ebay","paypa","google","ebay","google","paypay","paypal"}; 
		List<String> initialList = new ArrayList<>( Arrays.asList(appsArr));
		System.out.println("regular println"+initialList);
		System.out.printf("\nInitial list : %s%n",initialList);
	    sortList(initialList);
//		System.out.println("\nfrom method: "+result);
		
		//The sorList Method is declared once but runs both Hashset and TreeSet since they are both inside the method
		//curly braces. The return method makes it possible cause the method is not returning a value
		//see SetArralyList.java class
		
	}
	//using Type variable as generic type

	public static <T> List<T> sortList(List<T> myList) { // you can substitute List with void
		Set<T> hashsetList = new HashSet<>(myList);
		System.out.printf("\nUnique value using Hashset: %s%n",hashsetList );
		//Set<T> treesetList = new TreeSet<>(myList);
		//System.out.printf("\nUnique value using Treeset: %s",treesetList );
		return myList;
		
	}
	
	//explitly declaring generic type
//	public static List<String> sortList(List<String> myList) { // you can substitute List with void
//		Set<String> hashsetList = new HashSet<>(myList);
//		System.out.printf("\nUnique value using Hashset: %s%n",hashsetList );
//		Set<String> treesetList = new TreeSet<>(myList);
//		System.out.printf("\nUnique value using Treeset: %s%n",treesetList );
//		return myList;
//		
//	}
	

}
//See class SetArraList.java for Integers
