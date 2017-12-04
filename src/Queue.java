import java.util.ArrayList;

/**
 * This class represents the waiting queue
 * 
 * @author hanisaf
 *
 */
public class Queue {
	// What attribute are needed to store data in a queue
	// hint a collection
	// also make sure you store the max size 
	// and other information needed to compute the waiting time of the customer
	ArrayList<Integer> queue = new ArrayList<Integer>();
	
	/**
	 * Constructor
	 */
	public Queue() {
      //start here
	}
	
	/**
	 * Add a customer to the queue
	 * @param c customer to be added
	 */
	public void queueCustomer(Customer c) {
		System.out.println("Queue: added a customer at " + Clock.getTime());
		//start here
	}
	
	/**
	 * remove a customer from the queue, remember a queue means first come first served
	 * @return the customer removed
	 */
	public Customer unqueueCustomer() {
		//start here
		return null;
	}
	
	/**
	 * Getter method 
	 * @return queue max size
	 */
	public int getMaxSize() {
	   //start here
		return -1;
	}
	
	/**
	 * Getter method
	 * 
	 * @return the size of the queue
	 */
	public int getSize() {
	   //start here
		return -1;
	}
	
	/**
	 * Getter method
	 * @return true if the queue is empty i.e. no customers
	 */
	public boolean isEmpty() {
	   //start here
		return false;
	}
	
	/**
	 * Getter method
	 * @return the waiting time of the last customer
	 */
	public int getWaitingTime() {
	   //start here
		return -1;
	}
}
