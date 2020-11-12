package brainFeed;

public class AplayGround {
	 
	public static void main(String[] args) throws InterruptedException {
		chosefruit();
		System.out.println("\nskipped out non-fruit choice\n");
		System.out.println("Biden is going to be the next president of the United States!!!\n");
		System.out.println("Trumpism has come to an ubrupt end, Thanks God!!!");
		
		
		
	}

	public static void chosefruit() throws InterruptedException {
		String [] fruitArray = {"Apple", "banana","oranges", "watermelon", "eggs", "pizza"};

		for(String fruit:fruitArray) {
			Thread.sleep(1000);
			if(fruit =="eggs" || fruit=="pizza") continue;
			
			System.out.println(fruit);
			
		}
	}

}
