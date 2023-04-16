package javaBasics;

import java.nio.ByteOrder;

class Robot {
	
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		
		System.out.println("jumping " + height);
	}
	
	public void move (String direction, double distance) {
		
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
}

public class MethodsOne {
	

	public static void main(String[] args) {
		
		ByteOrder byteOrder = ByteOrder.nativeOrder();

		System.out.println(byteOrder);
		
		int i, j, k;
		
		i = 5;
		j = 6; 
		k = 4;

		int value = (i > j) ? (i > k ? i : k) : (j > k ? j : k);
		
		System.out.println(i + " " + " " + j + " " + k + " " + value);

		Robot robot = new Robot();
		robot.speak("Hi");
		
		robot.move("North", 300.50);
		
	}

}
