package javaBasics;

class Thing {
	
	public static final int LUCKY_NUMBER = 7;
	
	public String name;
	public static String description;
	/**
	 * A static method can not access
	 * an instance variable class as shown below 
	 * trying to access the variable name
	 * but can access a class variable (static)
	 */

	public static int count = 0;
	
	

	/**
	 * To create an unique id for each object 
	 * instantiated, declare an instance variable 
	 * and assign such variable to a class variable.
	 * Every time an object is instantiated the id
	 * is assigned an unique value;
	 */
	
	public int id;

	/**
	 * constructor
	 */
	
	public Thing() {
		id = count;
		count++;
	}
	
	
	public static void showName() {
		try {
			//System.out.println(name);
			System.out.println("Hello!!!");
			System.out.println(description);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void showId() {
		
		try {
			System.out.println("Object id:-> " + id + " " + description + " " + name);
		} catch (Exception e){		
			e.printStackTrace();	
		}
	}
}

public class StaticOne {

	public static void main(String[] args) {

		/**
		 * No need to instantiate the class Thing to 
		 * access a CLASS VARIABLE
		 */
		
		Thing.description = "Static keyword makes a class variable";
		
		/**
		 * Accessing a class method
		 * Pay attention to the static keyword
		 * when declaring the method.
		 */
		
		Thing.showName();

		/**
		 * To access instance variables
		 * must initialize a class
		 */
		System.out.println("Before creating an objectCount is equal to:-> "+ Thing.count);

		Thing thingOne = new Thing();
		
		Thing thingTwo = new Thing();
		System.out.println("After creating an objectCount is equal to:-> "+ Thing.count);

		
		thingOne.name = "Bob";
		thingTwo.name = "Alice";
		
		System.out.println(thingOne.name);	
		System.out.println(thingTwo.name);
		System.out.println(Thing.description);
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		
		thingOne.showId();
		thingTwo.showId();
		
	}

}
