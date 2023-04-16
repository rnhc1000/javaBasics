package javaBasics;

public class SpringBuilder {

	public static void main(String[] args) {
		/**
		 * Strings in Java are immutable!!!
		 */

		String info = "";

		info += "My name is Ricardo";
		info += ". ";
		info += "I am a builder";

		System.out.println(info);
		/**
		 * actually every time we append an string to the info variable we are creating
		 * a new string what is considered to be very ineffective. So the recommendation
		 * is to use a String Builder class;
		 */

		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Ricardo Ferreira");
		sb.append(". ");
		sb.append("I am a builder");

		System.out.println(sb);
		StringBuilder s = new StringBuilder();

		s.append("My name is Bob.").append(" ").append("I am a skydiver!");
		
		System.out.println(s);
		
		
		System.out.println("Here is some text... \t That´s a tab... \n That´s a new line");
		
		
		System.out.printf("This is the value: %.2f", 5.00);

	}

}
