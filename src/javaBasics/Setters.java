package javaBasics;

class Frog {
	
	String name;
	int age;
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setAge(int  age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		
		setName(name);
		setAge(age);
	}
}
public class Setters {

	public static void main(String[] args) {

		Frog frog = new Frog();
		frog.setName("Bertie");
		frog.setAge(1);
		
		System.out.println(frog.getName());
	}

}
