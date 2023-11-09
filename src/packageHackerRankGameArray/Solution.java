package packageHackerRankGameArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

class XY {
	private Integer x;
	private Integer y;

	public XY(int x, int y) {

		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "XY [x=" + x + ", y=" + y + "]";
//		return x + ", " + y;
	}

}

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner input = new Scanner(System.in);

		Map<Integer, String> a = new HashMap<>();

		ArrayList<List<Integer>> games = new ArrayList<>();
		List<XY> queries = new ArrayList<>();
		List<Integer> xyz = Arrays.asList(2, 3, 4, 5, 2);

		int numberOfQueries = Integer.parseInt(input.nextLine());
		for (int k = 0; k < numberOfQueries; k++) {

			Integer x = input.nextInt();
			Integer y = input.nextInt();
			queries.add(new XY(x, y));
			input.nextLine();
			games.add(Arrays.stream(input.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
		}

		Set<Integer> uniqueXyz = xyz.stream().collect(Collectors.toSet());
		System.out.println(uniqueXyz);

		System.out.println(games);
		Integer r = 0;
		//r = xyz.stream().filter(c -> c % 2 == 0);
		System.out.println("XYZ -> " + r);
//
//		for (XY x : queries) {
//
//			System.out.println(x);
//
//		}

//		queries.forEach((e) -> {
//			int x = e.getY();
//			System.out.println(x);
//		});
		List<Integer> leap = new ArrayList<>();
		queries.forEach(coordinates -> {

			leap.add(coordinates.getY());
		});
		boolean win = false;

		for (int l = 0; l < games.size(); l++) {

			// System.out.println("Dimensao 1: games " + l);

			for (int m = 0; m < games.get(l).size(); m++) {

				// int b = (games.get(l).get(m));
				// System.out.println("Dimensao 2: games " + m);
//				if (leap.get(n) > games.size()) {
//
////						System.out.println("Leap > size");
//				}

				if ((games.get(l).get(m) == 0)) {

					// queries.forEach((e)-> e.getY()) {

					win = true;
				} else {
					win = false;
				}

			}
			System.out.println(win);
//				break;

		}
		// System.out.println(win);

		// System.out.println(leap);
		// System.out.println(input.get(coordinates.getX()).get(coordinates.getY()));

//		for (int j = 0; j < queries.size(); j++) {
//
//			Integer leap = queries.get(j).get(1);
//			System.out.println(leap);
//
//			for (List<Integer> q : games) {

//				if (q.get(0) == 0) {
//
//					if ((q.get(0) + leap) == 0) {
//
//						System.out.println("Won!");
//					} else {
//						System.out.println("Lost!!");
//					}
//
//				}
//				System.out.println(q);
//			}

		for (List<Integer> innerList : games) {
			for (Integer number : innerList) {
				System.out.print(number + " " + "\n");
				int s = innerList.size();

				if (innerList.get(0) == 0)
					System.out.println(innerList.get(0) + " Primeira condição atendida");

			}
			System.out.println("\n");
		}

	}

}
