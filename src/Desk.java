/**
 * This class represents the checkout Desk
 * 
 * @author hanisaf
 *
 */
public class Desk {
	
	//What attributes are needed here?
	//What does desk need to know to operate?
	Customer currentCust = new Customer();
	

	
	/**
	 * Take a customer and start processing it
	 * @param c customer to be processed
	 */
	public void processCustomer(Customer c) {
		System.out.println("Desk: started processing customer at " + Clock.getTime());
		//start here
	}

	/**
	 * 
	 * @return true if the desk is currently processing a customer
	 */
	public boolean isBusy() {
      //start here
      return false;
				
	}
	/**
	 * Checks if the customer is done at the current minute
	 * This method is used to print information to the console
	 * if so, prints "Desk: finished processing customer at " + Clock.getTime())
	 */
	public void isCustomerDone() {
      //start here
		
	}
}
