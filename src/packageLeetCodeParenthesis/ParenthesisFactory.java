/**
 * 
 */
package packageLeetCodeParenthesis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rnhc1
 * Backtracking Data Structure
 * Backtracking is an algorithmic technique for solving problems recursively 
 * by trying to build a solution incrementally, one piece at a time, 
 * removing those solutions that fail to satisfy the constraints of the 
 * problem at any point in time 
 * (by time, here, is referred to the time elapsed till reaching 
 * any level of the search tree)
 *
 */
public class ParenthesisFactory {

	/**
	 * @param args
	 */
	// It will store the array of strings returned
	static List<String> outParenthesis = new ArrayList<>();
	
	public static List<String> parenthesisFactory(int n) {
		// 
		factoryParenthesis("", 0, 0, n);
		return outParenthesis;
	}
	
	public static void factoryParenthesis(String s, int u28, int u29, int n) {
		System.out.println("factory called for : " + s + " u28 : " + u28 + " u29 : " + u29 + " N: " + n);
		
		if (s.length() == 2*n) {
			outParenthesis.add(s);
		}
		
		if(u28 < n) {
			String t = s;
			t+="(";
			factoryParenthesis(t, u28+1, u29, n);
		}
		
		if (u29 < u28) {
			String t = s;
			t+=")";
			factoryParenthesis(t, u28, u29+1, n);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parenthesisFactory(3);
		
//		for (String c: outParenthesis ) {
//			
//			System.out.print(c + " ");
//		}
		System.out.print("\n" + outParenthesis);

	}

}
 