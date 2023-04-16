package javaBasics;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a commnad: ");
		String text = scanner.nextLine();
		
		switch(text) {
		case "start": 
			System.out.println("Machine Started!");
			break;
			
		case "stop":
			System.out.println("Machine Stopped!");
			break;
			
		default:
			System.out.println("Command not recognized!");
		}
		
	}
}