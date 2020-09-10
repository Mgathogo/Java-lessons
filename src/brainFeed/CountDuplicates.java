package brainFeed;

public class CountDuplicates {

	// Java program to count all duplicates from string using hashing

	static final int NO_OF_CHARS = 256;

	/* Fills count array with frequency of characters */
	static void fillCharCounts(String str, int[] count) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;//count array is adding up the characters that it encounters appearing
								   //more than ones. It is storing this in the count array
	}

	/* Print duplicates present in the passed string */
	static void printDups(String str) {
		// Create an array of size 256 and fill count of every character in it
		System.out.printf("List of duplicate characters in string: '%s' %n", str);
		int count[] = new int[NO_OF_CHARS];
		fillCharCounts(str, count);//count has all the characters of 256 including str. count is a bucket containing
								   //str and other characters. The fillChartCount method provide the blue print of how
								   //the process will run

		for (int i = 0; i < NO_OF_CHARS; i++)//count[str.chartAt(i)] is same as count[i] both are targeting indexes
											 //of characters location. str is included in the bucket of 256 characters
			if (count[i] > 1)
				System.out.printf("char %c has count = %d \n", i, count[i]);
		

	}

	// Driver Method
	public static void main(String[] args) {
		System.out.println("Test String Count:\n");
		String str = "test string!!!!!!!!!+++++++++++++"; 
		String str1 = "Assessment test";
		printDups(str);
		System.out.println("\nAssessment test count");
		printDups(str1);
	}

}
