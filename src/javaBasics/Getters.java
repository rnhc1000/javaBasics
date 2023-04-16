package javaBasics;

public class Getters {

	String name;
	int age;
	
	int getAge() {
		
		return age;
	}
	
//	int setAge(age) {
//		this.age = age;
//	}
	
	
	String getName() {
		return name;
	}
	
//	String setName(name) {
//		this.name = name;
//	}
//	
	void speak() {
		System.out.println("My name is " + name + " and I am " + age +" years old");
	}
	
	int calculateYearsToRetirement() {
		
		int yearsLeft = 70 - age;
		return yearsLeft;
	}

	public static void main(String[] args) {

		Getters getters = new Getters();
		
		getters.name = "Ricardo Ferreira";
		getters.age = 65;
		getters.speak();
		
		int years = getters.calculateYearsToRetirement();
		
		System.out.println("Years to Retire: " + years + " years");
		
		String name = getters.getName();
		int age = getters.getAge();
		
		
		System.out.println("My name is " + name + " and I´m " + age + " years old");
		
	}

}

