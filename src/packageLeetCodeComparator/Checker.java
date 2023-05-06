/**
 * 
 */
package packageLeetCodeComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author rnhc1
 *
 */
class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		String out = "";
		out = "[" + name + "," + score + "]";
		return out;
	}
}

public class Checker {

	/**
	 * @param args
	 */

//	public static void toString(Player player) {
//		
//		System.out.println(player.name);
//		System.out.println(player.score);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());

		}
		scan.close();
		List l = new ArrayList<>(Arrays.asList(player));

		for (int j = 0; j < player.length; j++) {

			System.out.println(Arrays.toString(player));
		}

		// System.out.println(Arrays.toString(player));
		System.out.println("List: " + l);

		int m = 5;

		Vector<Integer> v = new Vector<Integer>(m);

		try {
			v.add(1);
			v.add(3);
			v.add(7);
			v.add(5);
			v.add(6);
			v.add(4);
			v.add(2);
			v.add(8);
			v.add(9);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(v);
		Collections.sort(v, null);
		GFG x = new GFG();
		Collections.sort(v, x);

		x.print(v);

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");

		System.out.println(cars);

		Collections.sort(cars);
		System.out.println(cars);

	}
}
