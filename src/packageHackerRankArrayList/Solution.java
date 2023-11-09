package packageHackerRankArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class XY {
	private int x;
	private int y;

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
	}

}

public class Solution {
	public static String[] det;
	public static int r = 0;
	public static List list_r;

	public static void main(String[] args) {

		ArrayList<List<Integer>> input = new ArrayList<>();

//		ArrayList<List<Integer>> queries = new ArrayList<>();
		List<XY> queries = new ArrayList<>();

		Scanner data = new Scanner(System.in);

		int numberOfInputs = Integer.parseInt(data.nextLine());
		// data.nextLine();

		// int numberOfItems = data.nextInt();

		// data.close();
		// Scanner it = new Scanner(System.in);
		for (int i = 0; i < numberOfInputs; i++) {
			input.add(Arrays.stream(data.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
		}
//		for (int n = 0; n < lines; n++) {
//
//			String event = data.nextLine();
//
//			input.add(event);
//
//		}
		System.out.println(input);

		// String[] ix = input.toArray(new String[0]);
//
		// List<List<String>> partitions = new ArrayList<List<String>>();
//		for (int i = 0; i < input.size();)

		// System.out.println(Arrays.toString(ix));
		// String[] idx = input.get(0).split(" ");
		// for (int i = 1; i < input.size(); i++) {
		// idx = input.get(i).split(" ");
		// }

		int len = input.size();
		// r = len;
		// System.out.println(Arrays.toString(idx));
		// input.forEach((ipt) -> {
		// for (int k = 0; k < len; k++) {

		// det = ipt.split(" ");
		// List list_r = Arrays.asList(det);
		// System.out.println("list_" + r + " " + list_r);

		// System.out.println("Array per Array " + Arrays.toString(det));
		// }
		// System.out.println(det[0]);
		// r--;

		// });

		// for (r = 0; r < len; r++) {
		// System.out.println(list_r);
		// }

		// Scanner q = new Scanner(System.in);

		int numberOfQueries = Integer.parseInt(data.nextLine());

//		for (int i = 0; i < numberOfQueries; i++) {
//			queries.add(Arrays.stream(data.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
//		}
//
//		System.out.println(queries);
//
//		queries.forEach(c -> {
//			if (c.get(0) >= numberOfInputs || c.get(1) >= input.get(0).size()) {
//				System.out.println("ERROR!");
//			} else {
//				System.out.println(input.get(0).get(1));
//			}
//		});
		// Scanner query = new Scanner(System.in);

		for (int i = 0; i < numberOfQueries; i++) {
			Integer x = data.nextInt() - 1;
			Integer y = data.nextInt();
			queries.add(new XY(x, y));
		}

		System.out.println(queries);

		queries.forEach(coordinates -> {
			if (coordinates.getX() >= numberOfInputs || coordinates.getY() >= input.get(coordinates.getX()).size()) {
				System.out.println("ERROR!");
			} else {
				System.out.println(input.get(coordinates.getX()).get(coordinates.getY()));
			}
		});

//		Object[] details = input.toArray();
//
//		for (Object a : details) {
//			System.out.println(a);
//		}

		// String numberOfItems = "";

//		String liness = it.nextLine();
//		lines_n.add((liness + " "));
//		//String[] details;
//		lines_n.forEach((linx) -> {
//			String[] details = linx.split(" ");
//			System.out.println(Arrays.toString(details));
//			String numberOfItems = details[0];
//			System.out.println(numberOfItems);
//
//		});

//		System.out.println(numberOfItems);

//		for (int i = 0; i < numberOfItems; i++) {
//
//			String liness = it.nextLine();
//			lines_n.add(liness);
//		}

		// System.out.println(lines_n);

	}
//
//	record XY(int x, int y) {
//	};

}

/**
 * 
 * 5 5 41 77 74 22 44 1 12 4 37 34 36 52 0 3 20 22 33 5 1 3 3 4 3 1 4 3 5 5 5 5
 * 41 77 74 22 44 1 12 4 37 34 36 52 0 3 20 22 33 5 1 3 3 4 3 1 4 3 5 5
 */
