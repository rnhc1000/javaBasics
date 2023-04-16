package javaBasics;

public class Arrays {

	public static void main(String[] args) {

		int[] values = {1,2,3,4,5,6,7,8,9,10};
		
		int[] v;
		v = new int[10];
		
		System.out.println(values[8]);
		
		for (int i : values) {
			
			System.out.println(i);
		}
		
		for (int i=0; i< values.length; i++) {
			
			System.out.println(values[i]);
		}
	}

}
