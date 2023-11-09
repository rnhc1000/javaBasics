package packageAdafaceStaticBlocks;

import java.util.Arrays;

class Disease {
	static {
		System.out.print("A ");
	}

	public Disease() {
		System.out.print("B ");
	}

	public static int solution(int[] inputArray) {

		int partialOne = 0;
		int max = Integer.MIN_VALUE;
		int len = inputArray.length;

		for (int i = 0; i < len - 1; i++) {
			partialOne = inputArray[i] * inputArray[i + 1];
			System.out.println("Soma parcial " + partialOne);
			if (partialOne > max) {
				max = partialOne;
			}
		}
		return max;
	}

	public static int polygon(int n) {

		return (1 + (n - 1) * n) * 2 - 1;
	}

	public static int statue(int[] statues) {
		int statuesNeeded = 0;
		int diff = 1;
		Arrays.sort(statues);

		int len = statues.length;
		for (int i : statues) {
			System.out.print(i + " ");
		}
		for (int i = 0; i < len - 1; i++) {

			diff = Math.abs(statues[i] - statues[i + 1]);
			System.out.println("Diff " + diff);
			while (diff > 1) {

				statuesNeeded += 1;
				diff--;

			}

		}
		return statuesNeeded;
	}

	public static boolean sequence(int[] array) {

		int len = array.length;
		int lenAux = len - 1;
//		double random=Math.random()*lenAux;
//		int removed = (int)random;
//		if (removed == 0) removed+=1;
		int removed = 0;
		for (removed = 0; removed < len; removed++) {
			System.out.println("Random " + removed);
			int[] aux = new int[lenAux];
			for (int i = 0, k = 0; i < len; i++) {
				if (i == removed)
					continue;
				aux[k++] = array[i];
			}
			System.out.println(len + " " + aux.length);
			System.out.println(Arrays.toString(array));

			System.out.println(Arrays.toString(aux));
			for (int i = 1; i < lenAux; i++) {
				if (aux[i] <= aux[i - 1])
					return false;
			}
		}
		return true;

	}

	class Cancer extends Disease {
		static {
			System.out.print("C ");
		}

		public Cancer() {
			System.out.print("D ");
		}

		{
			System.out.print("E ");
		}
		static {
			System.out.print("F ");
		}

	}

	public class AdafaceDisease extends Cancer {

		public static void main(String[] args) {
			System.out.print("G ");
			Disease disease = new Disease();
			// new disease.AdafaceDisease();
			System.out.print("H ");

			int[] inputArray = { -23, 4, -3, 8, -12 };
			int soma = solution(inputArray);
			System.out.println("Soma -> " + soma);

			int i = 4;
			System.out.println(polygon(i));

			int[] arr = { 1, 3, 2, 1, 1 };
			System.out.println(statue(arr));

			int[] arrx = { 10, 1, 2, 3, 4, 5 };

			boolean r = sequence(arrx);
			// System.out.println(Arrays.toString(sequence(arrx)));
			System.out.println(r);
		}

	}
}