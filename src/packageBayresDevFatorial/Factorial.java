package packageBayresDevFatorial;

import static java.lang.System.*;

/**
 * 
 * @author rferreira
 * Fatorial int n = n*(n-1)*(n-2)....
 * Recursividade é o algoritmo escolhido...
 * Base case: quando n chegar a 1, fim
 */
public class Factorial {
	
		static public int getFactorial(int n) {
			int m=n;
			while (n != 1) {
				m = m*(n-1);
				n--;
				//System.out.println("M "+ m + " " + "N " + n);
				getFactorial(n);	
			}
			return m;
			
		}
	
	public static void main(String[] args) {
		int n = 6;
		int fat = getFactorial(n);
		
		out.println(n+"! -> "+ fat );

	}

}
