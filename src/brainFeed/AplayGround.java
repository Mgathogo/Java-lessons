package brainFeed;

public class AplayGround {
	 
	public static void main(String[] args) throws InterruptedException {
		String [] fruitArray = {"\nApple", "banana","oranges", "watermelon", "eggs", "pizza"};

		for(String fruit:fruitArray) {
			Thread.sleep(1000);
			if(fruit =="eggs" || fruit=="pizza") continue;
			
			System.out.println(fruit);
			
		}
		System.out.println("\nskipped out non-fruit choice");
		System.out.println("Michael");
		
		
		
	}

}
