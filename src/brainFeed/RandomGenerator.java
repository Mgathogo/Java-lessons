package brainFeed;

import java.util.Random;

public class RandomGenerator {
	
	public void testSomeFeature() {
	  
	     Random random = new Random();
	     int randomNumber =random.nextInt();
	     System.out.println("\nGenerated random number is "+randomNumber+"\n");
	  }
	public void luckyNumber() throws InterruptedException {
		Random objGenerator = new Random();
        for (int iCount = 1; iCount<= 5; ++iCount){
          int randomNumber = objGenerator.nextInt(35)+1;
          //if(randomNumber==randomNumber) break;
          Thread.sleep(1000);
         
          System.out.println("Lottery Lucky No is: " + randomNumber); 
        }
	}

	public static void main(String[] args) throws InterruptedException {
		RandomGenerator rd = new RandomGenerator();
		rd.testSomeFeature();
		rd.luckyNumber();
		//rd.luckyNumber();
		   
	}
    

}
	
	
