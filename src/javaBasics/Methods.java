package javaBasics;

public class Methods {

	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name + " and I am " + age +" years old");
	}

	public static void main(String[] args) {

		Methods method = new Methods();
		
		method.name = "Ricardo Ferreira";
		method.age = 65;
		method.speak();
	}

}
