package brainFeed;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		 printDuplicateCharacters("Programmming");
	        printDuplicateCharacters("Combination");
	        printDuplicateCharacters("Java");

	}
	public static void printDuplicateCharacters(String word) {
		char [] characters = word.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for(Character ch:characters) {
			//System.out.println(charMap.containsKey(ch));
			if(charMap.containsKey(ch)) {
				//System.out.println("Is this false "+charMap.containsKey(ch));
				charMap.put(ch, charMap.get(ch)+ 1);//if more than one character add one
				//System.out.println("This is the value"+charMap.get(ch));
			}
			else {
				charMap.put(ch, 1);//if not more than just put one to the character
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in string: '%s' %n", word);
		for(Map.Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()> 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}

}
