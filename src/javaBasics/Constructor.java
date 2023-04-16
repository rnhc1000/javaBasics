package javaBasics;



class Machine {
	public String name;
	public int code;
	
	public Machine() {
		System.out.println("First Constructor running!");
		name = "Narnia";
	}
	
	public Machine(String name) {
		System.out.println("Second Constructor running!!");
	}
	
	public Machine(String name, int code) {
		
		System.out.println("Third Constructor running!!!");
		
		this.name = name;
		this.code = code;
	}
}
public class Constructor {

	public static void main(String[] args) {
		
		Machine machineOne = new Machine();
		
		Machine machineTwo = new Machine("Bertie");
		
		Machine machineThree = new Machine("Chalky", 7);
		
		System.out.println(machineOne.name);
		System.out.println(machineTwo.name);
		System.out.println(machineThree.name);
		
		
		
	}

}
