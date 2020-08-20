package brainFeed;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class AplayGround {
	 
	public static void main(String[] args) throws InterruptedException {
		String [] fruitArray = {"\nApple", "banana","oranges", "watermelon", "eggs","pizza"};

		for(String fruit:fruitArray) {
			Thread.sleep(1000);
			if(fruit =="eggs" || fruit =="pizza") continue;
			
			System.out.println(fruit);
			
		}
		System.out.println("\nskipped out non-fruit choice\n");
		
		
		
		
		
	}

}
