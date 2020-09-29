package brainFeed;

public class InnerLoop {

	public static void main(String[] args) {
		//demonstration of how inner for loop works
				int arr[] = new int[] {1,2,3,4,5,6};
				int n = arr.length;
				for(int num2 = 0; num2 <= n;  num2++)
				{
				      for(int num1 = 0; num1 <= n-num2-1; num1++)
				      {
				            System.out.println(num2 + "   " + num1);
				      }
				}       

	}

}
