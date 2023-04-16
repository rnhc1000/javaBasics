package javaBasics;

public class ForLoops {

	public static void main(String[] args) {
		
		for(float i = 0.00f; i < 5.00f; i++) {
			
			System.out.println("Hello " + i);
			System.out.printf("The value of i is: %f\n", i);
			
		}
		
		/**
		 * for-each to loop exclusively over an array
		 * for (type variableName: arrayName) {
		 * 	code to be executed
		 * }
		 */
		String[] cars = {"XC40", "330i", "Amarok", "Up", "Z900"};
		for (String x: cars) {
			
			System.out.println(x);
		}

	}

}
