/**
 * @author hanisaf
 * This class models the Clock that governs the progress of the simulation
 */
public class Clock {
	private static int time = 0;
	
	/**
	 * resets time to 0, also call printTime to display time
	 */
	public static void resetClock() {
      time = 0;
      printTime();
	}
	
	/**
	 * advance time by one minute, also call printTime to display time
	 */
	public static void tick() {
      time++;
      printTime();
	}
	
	/**
	 * 
	 * @return the current time
	 */
	public static int getTime() {
	   //start here
		return time;
	}
	
	/**
	 * NO NEED TO CHANGE THIS METHOD
	 * prints time to the console
	 */
	public static void printTime() {
		System.out.println("Clock : time is " + time);
	}
}
