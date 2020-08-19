package brainFeed;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AplayGround {
	 
	public static void main(String[] args) throws InterruptedException {
		String [] fruitArray = {"\nApple", "banana","oranges", "watermelon", "eggs"};

		for(String fruit:fruitArray) {
			Thread.sleep(3000);
			if(fruit =="eggs") continue;
			
			System.out.println(fruit);
			
		}
		System.out.println("\nskipped out non-fruit choice");
		
		
		
	}

}
