/** 
 * @author rferreira
 * 
 * 
 */
package packageExceptionsOne;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {

		double dividend = 0;
		double divisor = 0;
		double remainder = 0;

		Scanner operand = new Scanner(System.in);

		try {
			System.out.print("Informe o dividendo: ");
			dividend = operand.nextDouble();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			System.out.print("Informe o divisor: ");
			divisor = operand.nextDouble();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		finally {
			
			operand.close();

			remainder = Division.division(dividend, divisor);

			System.out.printf("Resultado -> %.2f\n", remainder);
		}


	}

}

class Division {

	static final long serialversionUID = 1L;

	public static double division(double dividend, double divisor) throws Exception {

		if (divisor == 0) {

			throw new ArithmeticException(" / by zero");

		} else if (dividend == 0) {

			throw new ArithmeticException(" Dividendo deve ser maior que zero");

		} else {

			return dividend / divisor;
		}

	}
}
