package brainFeed;
/**
 * Java program to count number of words in a given 
 * sentence. Words are separated by white space
 * in a string
 * @author Owner
 *
 */

public class StringCounter {

	public static void main(String[] args) {
		//testing with non empty string
		String input = "Learning Java is great";
		int numOfWords = count(input);
		
		System.out.println("input: "+ input);
		System.out.println("count of words: "+numOfWords);
		
		//testing with empty string 
		input = "";
		numOfWords = count(input);
		
		System.out.println("input: "+ input);
		System.out.println("count of words: "+numOfWords);
		
		//testing with null string
		input = null;
		numOfWords = count(input);
		
		System.out.println("input: "+ input);
		System.out.println("count of words: "+numOfWords);
		
		


	}
	/**
	 * Return the number of words in a given string
	 * @param sentence, words are separated by white space
	 * @return counts of words in a sentence
	 */
	public static int count(String sentence) {
		if(sentence ==null || sentence.isEmpty()) {
			return 0;
		}
		String [] words = sentence.split("\\s+");
		return words.length;
	}

}
