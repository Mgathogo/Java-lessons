package brainFeed;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task 
 * to execute once 5 seconds have passed.
 */

public class Reminder {
    Timer timer;
    int i;

    public Reminder(int seconds) {
    	
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
        
	} 

    class RemindTask extends TimerTask {
        public void run() {
        	for(int i=1; i<5; i++)
        	//Thread.sleep(1);
        		System.out.println("I am working "+i);
            System.out.println("Time's up!");
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
        new Reminder(5);
        System.out.println("Task scheduled.");
    }
}
