package StockFruitRevised;

import java.util.Scanner;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class StockFruitRevised {
	
	// Method definition to print menu of user options
	public static void printMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("What would you like to do?");
		System.out.println("1. See monthly sales data");
		System.out.println("2. Calculate Apples needed to order");
		System.out.println("3. Calculate Oranges needed to order");
		System.out.println("4. Quit");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	

	// Main function
	public static void main(String[] args) {
		printMenu();
		// Initialize a dictionary to hold apple sales data
				Dictionary<String,Integer> appleSales = new Hashtable<String, Integer>();
				// Input previous sales data into our dictionary
				
				appleSales.put("January", 200);
				appleSales.put("February", 175);
				appleSales.put("March", 150);
				appleSales.put("April", 230);
				appleSales.put("May", 250);
				appleSales.put("June", 300);
				appleSales.put("July", 390);
				appleSales.put("August", 350);
				appleSales.put("September", 200);
				appleSales.put("October", 250);
				appleSales.put("November", 235);
				appleSales.put("December", 190);
				
				// Initialize a dictionary to hold orange sales data
				Dictionary<String,Integer> orangeSales = new Hashtable<>();
				// Input previous sales data into our dictionary
				orangeSales.put("January", 200);
				orangeSales.put("February", 200);
				orangeSales.put("March", 200);
				orangeSales.put("April", 230);
				orangeSales.put("May", 250);
				orangeSales.put("June", 230);
				orangeSales.put("July", 215);
				orangeSales.put("August", 200);
				orangeSales.put("September", 200);
				orangeSales.put("October", 200);
				orangeSales.put("November", 235);
				orangeSales.put("December", 190);
			
		
		// Variable Declarations
		
		boolean programRunning = true;

		Scanner scnr = new Scanner(System.in);
		int userInput = scnr.nextInt(); // Holds user choice
		
		if (programRunning = true) {
			switch(userInput) {
			case 1:
				System.out.println("Entering Sales History...");
				// Ask the user what data they want to see
				System.out.println("Would you like to see Average Apple sales or Average Orange sales?");
				System.out.println("1. Apples");
				System.out.println("2. Oranges");
		
				int userInput1 = scnr.nextInt();
				switch(userInput1) {
				// Case 1 outputs apple sales
				case 1:
					// Enumerate keys and elements
					Enumeration<String> e = appleSales.keys();
					// Keep running if there are more elements
					while(e.hasMoreElements()) {
						String key = e.nextElement();
						// Output key and element
						System.out.println(key + " - " + appleSales.get(key) + " apples");
					}
					break;
				// Case 2 outputs orange sales
				case 2:
					// Enumerate keys and elements
					Enumeration<String> i = orangeSales.keys();
					// Keep running if there are more elements
					while(i.hasMoreElements()) {
						String key = i.nextElement();
						// Output key and element
						System.out.println(key + " - " + orangeSales.get(key) + " oranges");
					}
					break;
				default:
					// Anything else is invalid
					System.out.println("Invalid Input");
				}
				break;
				
			case 2:	// Apples needed to order
				System.out.println("Please type the month by number (January is 1, February is 2, etc.)");
				int userMonthApple = scnr.nextInt();
				String userMonth = null;
				System.out.println("How many apples are on hand?");
				int userCountApple = scnr.nextInt();
				int applesNeeded = 0;
				switch(userMonthApple) {
				// We assign the user input to a string so we can query the dictionary
				case 1:
					userMonth = "January";
					break;
				case 2:
					userMonth = "February";
					break;
				case 3:
					userMonth = "March";
					break;
				case 4:
					userMonth = "April";
					break;
				case 5:
					userMonth = "May";
					break;
				case 6:
					userMonth = "June";
					break;
				case 7:
					userMonth = "July";
					break;
				case 8:
					userMonth = "August";
					break;
				case 9:
					userMonth = "September";
					break;
				case 10:
					userMonth = "October";
					break;
				case 11:
					userMonth = "November";
					break;
				case 12:
					userMonth = "December";
					break;
				}
				
				applesNeeded = (appleSales.get(userMonth));
				applesNeeded = applesNeeded - userCountApple;
				System.out.println("Oranges needed to order based on last years sales: " + applesNeeded);
		
				break;
				
			case 3:	// Oranges needed to order
				System.out.println("Please type the month by number (January is 1, February is 2, etc.)");
				int userMonthOrange = scnr.nextInt();
				userMonth = null;
				System.out.println("How many oranges are on hand?");
				userCountApple = scnr.nextInt();
				applesNeeded = 0;
				switch(userMonthOrange) {
				case 1:
					userMonth = "January";
					break;
				case 2:
					userMonth = "February";
					break;
				case 3:
					userMonth = "March";
					break;
				case 4:
					userMonth = "April";
					break;
				case 5:
					userMonth = "May";
					break;
				case 6:
					userMonth = "June";
					break;
				case 7:
					userMonth = "July";
					break;
				case 8:
					userMonth = "August";
					break;
				case 9:
					userMonth = "September";
					break;
				case 10:
					userMonth = "October";
					break;
				case 11:
					userMonth = "November";
					break;
				case 12:
					userMonth = "December";
					break;
				}
				
				applesNeeded = (orangeSales.get(userMonth));
				applesNeeded = applesNeeded - userCountApple;
				System.out.println("Oranges needed to order based on last years sales: " + applesNeeded);

				break;
				
			case 4:	// Quit
				// Say Goodbye to the user
				System.out.println("Closing program...");
				System.out.println("Goodbye");
				programRunning = false;
				break;
			default:
				System.out.println("Invalid Input");
			}
			
		}
		else {
				System.out.println("Goodbye");
			}

		scnr.close();
	}		
}