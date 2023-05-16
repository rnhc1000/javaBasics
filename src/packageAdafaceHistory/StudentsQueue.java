package packageAdafaceHistory;

import java.util.ArrayList;
import java.util.List;

public class StudentsQueue {
	
	StudentsQueue(int[] credits) {
		
		List<Integer> positives = new ArrayList<>();
		List<Integer> negatives = new ArrayList<>();
		
		for (int x : credits) {
			
			if (x > 0) {
				
				positives.add(x);
				
			} else {
				
				negatives.add(x);
				
			}
		}
//		System.out.print(positives);
//		System.out.print(negatives);
		
		positives.addAll(negatives);
		
		System.out.print("\n" + positives);
	}
	

	public static void main(String[] args) {
		
		
		int [] notas = { 20, 70, -40, 30, -10 };
		
		StudentsQueue st = new StudentsQueue(notas);

		
	}

}
