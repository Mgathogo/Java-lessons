package brainFeed;

public class SmallIndex {
	public static int findIndex(int arr[], int t) {
		if(arr==null) {
			return -1;
		}
		//find length of array
		int len = arr.length;
		int i = 0;
		
		//traverse in the array
		while(i<len) {
			if(arr[i]==t) {
				return i;
			}
			else {
				i++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] my_array = {7, 9, 20, 4, 22, 40};
		System.out.println(findIndex(my_array,40));
		

	}

}
