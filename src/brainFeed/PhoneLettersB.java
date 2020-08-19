package brainFeed;

import java.util.LinkedList;
import java.util.List;

public class PhoneLettersB {
	static String [] mapping = new String [] {"0","1","abc","def","ghi","jkl","mno",
			"pqrs","tuv","wxyz"};
	public static List<String> printKeyWords(String digits){
		LinkedList<String> ans = new LinkedList<>();
		if(digits.isEmpty()) return ans;
		
		ans.add("");
		for(int i=0; i<digits.length(); i++) {
			int x = Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length()==i){
				String permutation = ans.remove();
				for(char c:mapping[x].toCharArray()) {
					ans.add(permutation + c);
				}
			}
			
		}
		return ans;
	}
	

	public static void main(String[] args) {
		String digits = "23";
		
		System.out.println(printKeyWords(digits));
	}

}
