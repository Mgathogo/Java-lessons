package brainFeed;

public class Arrays {
	public int computeSum(int[] nums) {
		  int sum = 0;
		  for (int i=0; i<nums.length; i++) {
		    sum +=nums[i];
		  }
		  return sum;
		}
	int findSmallest(int[] values) {
		  int minIndex = 0;  // start with 0th element as min
		  for (int i=0; i<values.length; i++) {
		    if (values[i] < values[minIndex]) {
		      minIndex = i;
		    }
		  }
		  return minIndex;
		}
	int findSmallest1(int[] number) {
		  int minValue = number[0];  // start with 0th element as min
		  for (int i=0; i<number.length; i++) {
		    if (number[i] < minValue) {
		    	minValue = number[i];
		    }
		  }
		  return minValue;
		}
	//java program to print front back
	public String frontBack(String str) {
		  if (str.length() <= 1) return str;
		  System.out.println(str);
		  
		  String mid = str.substring(1, str.length()-1);
		  
		  // last + mid + first
		  return str.charAt(str.length()-1) + mid + str.charAt(0);
		}

	public static void main(String[] args) {
		Arrays ar = new Arrays();
		
		int[]array = {10,6,7,24,87,56};
		int results = ar.computeSum(array);
		System.out.println("The sum is "+results);
		int min = ar.findSmallest(array);
		System.out.println("Min Index is "+min);
		int minValue = ar.findSmallest1(array);
		System.out.println("Min value is "+minValue);
		String s = ar.frontBack("code");
		System.out.println(s);
		
		System.out.println(results);
		System.out.println();
		System.out.println(min);
		System.out.println();
		System.out.println("perfect");
	}

}
