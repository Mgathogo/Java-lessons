package brainFeed;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

//Java program to find all the distinct elements and put all those elements in an array. if no number is duplicate
//in input 1, then output should be {-1}

public class DuplicatesInArray {

	public static void main(String[] args) {
		Integer[] array = {1,2,3,4,5,6,7,8,8,4,2};  //input 1
		int size = array.length;              //input 2
		System.out.println("Original array: "+Arrays.toString(array));
		extractDuplicates(array, size);
		
		List<String> list1 = Arrays.asList("a1","b1");
		List<String> list2 = Arrays.asList("a2","b2");
		Set<List<String>> mySet = new HashSet<List<String>>();
		//System.out.println(mySet);
		mySet.add(list1);
		mySet.add(list2);
		System.out.println("from hashSet"+mySet);
		mySet.add(Arrays.asList("a1","b1"));   // duplicate won't be added
		//System.out.print(mySet.size()); 
		System.out.println(mySet);
    }

	public static void extractDuplicates(Integer [] array, int size) {
		//Using Set Interface, since set does not allow duplicates
		//set would be set to false so that it can ignore the unique elements and just show repeated ones
		//the repeated ones would be added to the duplicate array
        Set<Integer> set = new HashSet<>();//this is for setting truthy to false to target the duplicates
        Set<Integer> duplicates = new HashSet<>();// this is for storing new array with duplicates
           
        for(int i = 0; i < size ; i++){
        //True will print unique numbers since it is a set, change it to fault to print only the repeating
        //numbers, The default value of a set is true to print non-duplicate numbers but if you set it to false
        //it will show only the repeated elements, you can add those elements in a new set to print them	
            if(set.add(array[i])==false) {
                duplicates.add(array[i]);
            }
        }
          
        if(duplicates.size() == 0) {
            duplicates.add(-1);
        }
          
        System.out.println("duplicates: "+duplicates);
        System.out.println("Unique set: "+set);
	}
	
	}


