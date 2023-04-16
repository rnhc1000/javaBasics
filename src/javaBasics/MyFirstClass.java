package javaBasics;

public class MyFirstClass {
	
	// instance variable (data or "state"
	String name;
	int age;
	
	/**
	 * Class can contain 
	 * 1. Data
	 * 2. Subroutines ( methods)
	 * 
	 */

	public static void main(String[] args) {
		
		/**
		 * Instantiate the template MyFirstClass
		 * assigning memory space for the object created
		 * and referenced by the name of the variable
		 * MyFirstClass(type) myFirstClass(variable) = new((createObject)) MyFirstClass(class)
		 * 
		 * 
		 */
		
		MyFirstClass myFirstClass = new MyFirstClass();
		
		myFirstClass.name = "Ricardo Ferreira";
		myFirstClass.age = 65;
		
		
		MyFirstClass mySecondClass = new MyFirstClass();
		
		mySecondClass.name = "Perpétua do Socorro";
		mySecondClass.age = 45;
		
		System.out.println(myFirstClass.name + " " + myFirstClass.age + " anos");
		
		System.out.println(mySecondClass.name + " " + myFirstClass.age + " anos");

	}

}
