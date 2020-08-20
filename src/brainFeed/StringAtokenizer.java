package brainFeed;

import java.util.Stack;
import java.util.StringTokenizer;
//last in last out LIFO
public class StringAtokenizer {

	public static void main(String[] args) {
		StringBuilder reverseString = tokenizerMethod();
		 
		System.out.println("\n"+reverseString.toString());

	}

	public static StringBuilder tokenizerMethod() {
		String description = "Java technology blog for smart java concepts and coding practices";
		 
		// reverse string builder
		StringBuilder reverseString = new StringBuilder();
		
		 
		// Put words from String in Stack
		Stack<String> myStack = new Stack<>();
		 
		StringTokenizer tokenizer = new StringTokenizer(description, " ");
		 
		while (tokenizer.hasMoreTokens()) {
		    myStack.push(tokenizer.nextToken());
		}
		 
		//Pop each word from stack and append in builder
		 
		while (!myStack.empty()) {
		    reverseString.append(myStack.pop() + " ");
		}
		return reverseString;
	}

}
