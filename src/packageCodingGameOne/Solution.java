/**
 * 
 * Given a temperature range from low to high (inclusive) in Kelvin (K), 
 * and a temperature in an unknown unit (one of Kelvin, degrees Fahrenheit (F) 
 * or degrees Celsius (C)), you need to output the temperature transformed 
 * into Kelvin. Output should be rounded down to an integer, 
 * and should be low<=output<=high.
 * Transformations:
 * Celsius    to Kelvin: K = C + 273.15
 * Fahrenheit to Kelvin: K = (F + 459.67) * (5/9)
 * Example
 * low 283, high 303
 * temperature 15.5
 * temperature can only be C, because only then the transformation 
 * into K (15.5+ 273.15=288.65) results in low<=output<=high. 
 * Output is 288.
 * 
 */

package packageCodingGameOne;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
public class Solution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int hi = 0;
		int low = 0;
		try {
			low = in.nextInt();
		} catch (Exception ex) {
			System.out.println("Numeros Inteiros apenas");
		}

		try {
			hi = in.nextInt();
		} catch (Exception ex) {
			System.out.println("Numeros Inteiros apenas");
		}

		float temperature = in.nextFloat();

		// Write an answer using System.out.println()
		// To debug: System.err.println("Debug messages...");
		// float celsius = 0.0f;
		// float fahrenheit = 0.0f;

		// 0 C -> 273.15 K
		// 32 F -> 273.15K
		float f = 0.0f;

		float celsius2kelvin = temperature + 273.15f;
		float factor = (float)5/9;
		float fahrenheit2kelvin = (temperature + 459.67f)* factor;
		System.out.printf("Temperature Kelvin : %.2f\n",      celsius2kelvin);
		System.out.printf("Temperature Fahrenheit : %.2f\n" , fahrenheit2kelvin);
		
		if (celsius2kelvin >= low && celsius2kelvin <= hi) {
			System.out.printf("Temperature informed is in Celsius and is equal to -> %d K\n", (int) celsius2kelvin);
		} else if (fahrenheit2kelvin >= low && fahrenheit2kelvin <= hi) {
			System.out.printf("Temperature informed is in Fahrenheit and is equal to -> %d K\n", (int) fahrenheit2kelvin);
		} else {
			System.out.printf("Temperature is in Kelvin and is equal to -> %d", (int)temperature);
		}
	}
}
