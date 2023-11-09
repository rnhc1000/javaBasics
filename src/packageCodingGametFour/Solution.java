package packageCodingGametFour;

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

	public static int computeClosestToZero(int[] ts) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");
		int tsLength = ts.length;
		if (tsLength == 0)
			return 0;
		int smallTemp = ts[0];
		for (int i = 0; i < tsLength; i++) {
			if (ts[i] < smallTemp) {
				smallTemp = ts[i];
				System.out.println(smallTemp);
			}
		}
		if (smallTemp < 0) {
			int shadowTemp = smallTemp * -1;
			for (int i = 0; i < tsLength; i++) {
				if (shadowTemp == ts[i])
					return shadowTemp;
			}
		}
		return smallTemp;
	}

	/* Ignore and do not change the code below */
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ts = new int[n];
		for (int i = 0; i < n; i++) {
			ts[i] = in.nextInt();
		}
//        PrintStream outStream = System.out;
//        System.setOut(System.err);
		int solution = computeClosestToZero(ts);
//        System.setOut(outStream);
		System.out.println(solution);
		
		new ClassB();
	}
	/* Ignore and do not change the code above */
		
}
class ClassA{
	
	ClassA() {
		System.out.println("A Constructor");
	}
}

class ClassB extends ClassA{
	
	ClassB() {
		System.out.println("B Constructor");
	}
}
/**
 * {7 5 9 1 4} -> 1
 * {5526}
 * {-15 -7 -9 -14 -12} -> -15
 * {-10 -10} -> -10
 * {15 -7 9 14 7 12} -> 7
 * {12 13 14 6 5 -6} -> 6 
*/
