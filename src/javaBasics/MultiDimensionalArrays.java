package javaBasics;

public class MultiDimensionalArrays {

	public static void main(String[] args) {

		int[] values = { 3,2,245};
		
		for (int value: values) {
			System.out.println(value);
		}
		
		int[][] grid = {
				{3,2,245},
				{2,4},
				{2,3,4,5}
		};
		
		String[][] texts = new String[2][3];
		int row = 0;
		int column = 0;
		
		int gridLength =  grid.length;
		System.out.println(("Grid Length -> " + gridLength));
		int eachRowLength = grid[row].length;
		System.out.println("Row Length -> " + eachRowLength);
		
		for (row = 0; row < gridLength; row++) {
			
			eachRowLength = grid[row].length;
			
			for (column = 0; column < eachRowLength; column++) {
				
				System.out.println("Multidimensional -> " + grid[row][column]);
				
				
			}
			
			
		}
	}

}
