package packageHackerRankPriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {

	private int id;
	private String name;
	protected double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getCGPA() {
		return this.cgpa;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.cgpa;
	}
}

class PrioritiesQueue {

	public static PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.comparing(Student::getCGPA).reversed()
			.thenComparing(Student::getName).thenComparing(Student::getID));

	public static List<Student> getStudents(List<String> events) {

		events.forEach((event) -> {

			if (event.equals("SERVED")) {
				pq.poll();
				System.out.println();
			} else {

				String[] details = event.split(" ");
				System.out.println(Arrays.toString(details));
				//System.out.println("Size -> " + details.length);

					pq.add(new Student(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
				
			}
		});

//    	for (String eve : events) {
//    		
//    		
//    		
//    		String event = (String)eve[0];
//    		switch (event) {
//			
//				case "SERVED": 
//					System.out.println("POLL OK!");
//					pq.poll();
//					System.out.println(pq);			
//				break;
//				
//				default:
//					
//					break;
//			
//    		}
//    				
//    	}
//    		

		List<Student> students = new ArrayList<>();
		while (!pq.isEmpty()) {
			students.add(pq.poll());
		}
		System.out.println(students);
		return students;
//	Scanner input = new Scanner(System.in);
//	
//	int numberOfOps = input.nextInt();

//	for (int i=0; i<numberOfOps; i++) {
//		String ops = input.next();
//
////		input.nextLine();
//		
//		//System.out.println("OPS-> " + ops + " " + "Name-> " + name + " " + "Grade-> " + grade + " " + "ID-> " + idStudent);
//		
//		switch (ops) {
//			case "ENTER":
//				String name = input.next();
//				double grade = input.nextDouble();
//				int idStudent = input.nextInt();				
//				System.out.println("\n ADD OK!");
//				pq.add(new Student(idStudent, name, grade));
//				System.out.println(pq);
//			break;
//			
//			case "SERVED": 
//				System.out.println("POLL OK!");
//				 pq.poll();
//				System.out.println(pq);			
//			break;
//		
//			
//		}
//	}

	}
}

public class Solution {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		List<String> events = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int numberOfOps = input.nextInt();
		Scanner it = new Scanner(System.in);

		for (int i = 0; i < numberOfOps; i++) {

			String event = it.nextLine();
			events.add(event);
		}

//		PrioritiesQueue prioritiesQueue = new PrioritiesQueue();
//		PrioritiesQueue prioritiesQueue = new PrioritiesQueue(Comparator.comparing(Student::getCGPA).
//				reversed().thenComparing(Student::getName).thenComparing(Student::getID));

		List<Student> students = PrioritiesQueue.getStudents(events);
		// String ops = input.next();

//			input.nextLine();

		// System.out.println("OPS-> " + ops + " " + "Name-> " + name + " " + "Grade-> "
		// + grade + " " + "ID-> " + idStudent);

//			switch (ops) {
//				case "ENTER":
//					String name = input.next();
//					double grade = input.nextDouble();
//					int idStudent = input.nextInt();				
//					System.out.println("\n ADD OK!");
//					pq.add(new Student(idStudent, name, grade));
//					System.out.println(pq);
//				break;
//				
//				case "SERVED": 
//					System.out.println("POLL OK!");
//					 pq.poll();
//					System.out.println(pq);			
//				break;
//			
//				
//			}
//		}
		// input.nextLine();

		// System.out.println(students.toString());

//		students.add(new Student(1, "Ricardo", 3.37));
//		students.add(new Student(2, "Perpétua", 3.58));
//		students.add(new Student(3, "Henrique", 5.00));
//		students.add(new Student(4, "Nathalia", 3.67));
//		Student studentOne =   new Student(1, "Ricardo", 3.57);
//		Student studentTwo =   new Student(2, "Perpétua", 3.58);
//		Student studentThree = new Student(3, "Henrique", 5.00);
//		Student studentFour =  new Student(4, "Nathalia", 3.67);

//		Iterator it = students.iterator();
//		while(it.hasNext()) {
//			
//			pq.add((Student) it.next());
//		}
//////		
//		for (Object i : students) {
//			
//			pq.add(students[i]);
//		}

//		
//		Iterator itx = pq.iterator();
//		while(itx.hasNext()) {
//			
//			System.out.println(itx.next().toString() + " ");
//		
//		}
//		pq.add(studentOne);
//		pq.add(studentTwo);
//		pq.add(studentThree);
//		pq.add(studentFour);

		// System.out.println(pq.peek().toString());
//		
//		Iterator it = pq.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println(it.next().toString() + " ");
//		}
//		
//		input.close();
//		
//		
//		
//		if(pq.isEmpty()) {
//			System.out.println("EMPTY");
//		} else {
//			System.out.println((pq));
//		}
//		
		System.out.println(events);
		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
			//System.out.println(students);
		}
		
		/**
		 * 12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
		 */
		int i=0;
		List<Integer> list_i;

		
		for (i=0; i<5; i++) {
		 list_i = Arrays.asList(i,1);
			System.out.println("list_" + i + " " + list_i);
			
		}
		
		

	}
}
