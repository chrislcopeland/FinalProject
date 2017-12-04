/**
 * This class represents the customer
 * @author hanisaf
 */
public class Customer {
	int arriveTime = 0;
	int duration = 0;
	int waitTime = 0;

	
	/**
	 * Constructor of the class
	 * @param arriveTime customer arrival time
	 * @param duration customer duration
	 */
	public Customer(int arriveTime, int duration) {
      this.arriveTime = arriveTime;
      this.duration = duration;
	}
	
	/**
	 * Getter method of arrival time
	 * @return time of arrival
	 */
	public int getArriveTime() {
	   // start here
		return arriveTime;
	}
	
	/**
	 * Getter method of duration
	 * @return duration
	 */
	public int getDuration() {
	   // start here
		return duration;
	}
}
