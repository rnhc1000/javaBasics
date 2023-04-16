package javaBasics;

public class NonPrimitiveTypes {

	public static void main(String[] args) {
		
		/**
		 * String actually is a class
		 * 
		 */
		String text = "Hello";
		String blank = " ";
		String name = "Bob";
		
		String greeting = text + blank + name;
		
		System.out.println(greeting);
	}

}
