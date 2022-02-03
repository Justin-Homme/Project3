package project3;

/**
 * Project 3: Array methods
 * @version 02/09/21
 * @author DKT
 * @author Nathan Gossett
 * @author Justin Homme
 */
import java.util.Random;

	public class Project3
	{
		
		
		/**
		 * Calculate average of all values in an array
		 * @param exampleArray input array
		 * @return average of all elements in array
		 */
		private static double getAverage(int[] exampleArray) {
			double sum = 0; 							   // initialize 'sum' outside of the loop so it
														   // can be called after the loop
			for(int i = 0; i < exampleArray.length; i++) {
				sum = sum + exampleArray[i]; 			   // adds each value in the array to the sum
			}
			double average = (sum / exampleArray.length);  // sum of values divided by length of array = average
			return average; 							   // returns the average to be called in main
		}
		
		
		/**
		 * Count how many positive integers are in an array
		 * @param exampleArray an array of integers
		 * @return counter the number of positive values in input array
		 */
		private static int countPositiveNumbers(int[] exampleArray) {
			int counter = 0; 								// initializes 'counter' outside of the loop so it
															// can be called after the loop
			for(int i = 0; i < exampleArray.length; i++) {
				if(exampleArray[i] > 0) { 					// simply tests each value to see if it is positive
					counter++; 			  					// if the value is positive, 'counter' goes up by 1
				}	
			}
			return counter; 								// returns 'counter' to be called in main
		}

		
		

		/**
		 * Create an array that's the same length, but with values that are twice 
		 * the corresponding values in the original
		 * @param exampleArray input an array of integers
		 * @return doubledArray a new array with doubled values
		 */
		private static int[] createDoubledArray(int[] exampleArray) {
			int[] doubledArray = new int[exampleArray.length]; // creates a new array called 'doubledArray'
			for(int i = 0; i < exampleArray.length; i++) {
				doubledArray[i] = (exampleArray[i] * 2); 	   // sets each value in 'doubledArray' to its
			}											 	   // counterpart in 'exampleArray' doubled
			return doubledArray; 						 	   // returns the new array to be used in main
		}	


		/**
		 * The extra credit 4th method
		 * Shifts each value in the array to the position on its left
		 * @param exampleArray an array of integers
		 */
		private static void shiftArrayLeft(int[] exampleArray) {
			int x = exampleArray[0]; 					 // Sets x equal to the first array value (for later)
			for(int i = 0, j = 1; j < exampleArray.length; i++, j++) {
				exampleArray[i] = exampleArray[j]; 		 // array values are changed to the value of the
			}									   		 // spot above it
			exampleArray[(exampleArray.length) - 1] = x; // Sets the final value of the array (length - 1 
		}												 // since indexing starts at 0) to the (previously)	
												         // first array value so that the final
												         // two spots aren't left with the same value
		
		/**
		 * Method to print all elements in the array
		 * @param arrayToPrint The array to be printed
		 */
		public static void printArray(int [] arrayToPrint)
		{
			for (int i = 0; i < arrayToPrint.length; i++){
				System.out.print(arrayToPrint[i] + " ");
			}
			System.out.println("");
		}
		
		
		
		public static void main(String [] args)
		{
			//providing a parameter makes sure we get the exact same
			//"random" number sequence every time we run the program
			//Here we have a seed of 1337 
			Random generator = new Random(1337);
			int [] exampleArray = new int[20];
			for (int i = 0; i < exampleArray.length; i++){
				exampleArray[i] = generator.nextInt(51)-25;
				//nextInt(51) gives values from 0 to 50
				//subtracting 25 makes the values -25 to 25
			}
			printArray(exampleArray);

			// Method 1: Calling calculate average
			
	    	System.out.println("\nThe average of the numbers is: " + getAverage(exampleArray));
			 

			// Method 2: Counting the number of positive numbers
			
	    	System.out.println("\nThe number of positive numbers is: " + 
	    		countPositiveNumbers(exampleArray));
			 

			// Method 3: Create a second array that contains values that are 
			// all twice as large as the corresponding element in the original
			int[] doubledArray = createDoubledArray(exampleArray);
			System.out.println("\nThe original array is: ");
			printArray(exampleArray);
			System.out.println("The doubled array is: ");
			printArray(doubledArray);

			// This method is worth 1pt of extra credit
			// Method 4: Shift the array either to the left, wrapping
			// the previous first item around to the end of the array
			// This method will overwrite the array passed in
			System.out.println("\nThe original array is: ");
			printArray(exampleArray);
			shiftArrayLeft(exampleArray);
			System.out.println("After shifting everything to the left: ");
			printArray(exampleArray);

		}
	}
