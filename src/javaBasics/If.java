package javaBasics;

public class If {

	public static void main(String[] args) {
		
		int myInt = 15;
		
		
		if (myInt < 10) {
			
			System.out.println(myInt);
			
		} else if (myInt > 20) {
			
			System.out.println(myInt);
			
		} else {
			
			System.out.println("None of the above");
		}
		
		int loop = 0;
		
		while(true) {
			System.out.println("Looping: " + loop);
			
			if (loop == 5) {
				break;
				/**
				 * get out of the while loop
				 * when 5 is hit!!!
				 */
			}
			loop++;
		}
		System.out.println("Break in action!!!");

	}
		
}
