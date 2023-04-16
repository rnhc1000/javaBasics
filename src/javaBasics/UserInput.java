package javaBasics;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt output
		System.out.println("Enter a line of text: ");
		
		// Wait for the user input
		String line = input.nextLine(); 
		
		//Print out what was entered
		System.out.println("You entered " + line);
		
		System.out.println("Enter an integer: ");
		
		int value = input.nextInt();
		
		System.out.println("Your integer is :" + value);
	}

}
