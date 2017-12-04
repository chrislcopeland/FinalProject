//This class represents the chekout Desk

public class Desk {
	
	//What attributes are needed here?
	//What does desk need to know to operate?
	
	//The total number of customers 
	int totalCustomers = 0;
	
	//The total number of processed customers
	int processedCustomers = 0;
	
	//The maximum size of the waiting queue
	int maxWaiting = 0;
	
	//The minimum of customer waiting time in the queue
	int minWaiting = 0;
	
	//The maximum of customerwaiting time in the queue
	int maxCustomerWaiting = 0;
	
	//Theaverage ofcustomer waiting timein the queue
	double avgCustomerWaiting = 0.0;
	
	//The median of customer waiting time in the queue
	double medianCustomerWaiting = 0;
	
	//The standard deviation of customer waiting time in the queue
	double sdCustomerWaiting = 0.0;
	
	 //Take a customer and start processing it
	 //@param c customer to be processed
	 
	public void processCustomer(Customer c) {
		System.out.println("Desk: started processing customer at " + Clock.getTime());
		//start here
	}

 
	 //@return true if the desk is currently processing a customer
	 
	public boolean isBusy() {
      //start here
      return false;
				
	}

	 //Checks if the customer is done at the current minute
	 //This method is used to print information to the console
	 //if so, prints "Desk: finished processing customer at " + Clock.getTime())
	
	public void isCustomerDone() {
      //start here
		
	}
}
