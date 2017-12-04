import java.util.Scanner;
/**
 * 
 * @author hanisaf
 * This is the Main class that kick starts the program
 * 
 */
public class Main {

	/**
	 * YOU DON'T NEED TO CHANGE THIS METHOD
	 */
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter file name : ");
		String fileName = keyboard.nextLine();
		Scenario scenario = new Scenario(fileName);
		scenario.run();
	}
	

}
