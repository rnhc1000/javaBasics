package javaBasics;
import java.util.Scanner;

public class UserInputOne {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter a number: ");
//		
//		int value = scanner.nextInt();
//		
//		while ( value != 5) {
//			
//			System.out.println("Enter a number: ");
//			value = scanner.nextInt();
//		}
//		
//		System.out.println("Got 5!");
//		
		int v = 0;
		
		do {
			
			System.out.println("Enter a number: ");
			v = scanner.nextInt();
		}
		while (v != 5);
		
		System.out.println("Got 5!");
		
	}

}
