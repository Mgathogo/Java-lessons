package brainFeed;
//java program to demonstrate how inner for loop works
public class InnerLoop {

	public static void main(String[] args) {
				int arr[] = new int[] {1,2,3,4,5,6};
				int n = arr.length;
				for(int num2 = 0; num2 < n-1;  num2++)
				{
				      for(int num1 = 0; num1 <= n-1; num1++)
				      {
				            System.out.println(num2 + " | " + num1);
				      }
				}       

	}

}
