package packageBayresDevQueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	
	
	public static void StandingQueue() {
		
		Queue<String> standingQueue = new LinkedList<String>();
		
		standingQueue.add("Ricardo");
		standingQueue.add("Ferreira");
		standingQueue.add("Perpétua");
		standingQueue.add("Socorro");
		
		System.out.println("Queue -> " + standingQueue);
		
		String front = standingQueue.remove();
		
		System.out.println("Remove the 1st->  " + front);
		System.out.println("Queue after Removal "+ standingQueue);

		standingQueue.add("Ricardo");
		System.out.println("Added element back to Queue... " + standingQueue);
		System.out.println("Peeking the 1st One-> " + standingQueue.peek());
		System.out.println("Queue after peeking the 1st... " + standingQueue);
		
		
		Iterator iterator = standingQueue.iterator();
		
		while(iterator.hasNext() ) {
			
			System.out.println(iterator.next());
		}
		
	}
	
	public static List<String> addList(int n) {
		
		List<String> addingPerson = new ArrayList<String>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				addingPerson.add("Person"+i+j);					
			}
		}
		
		return addingPerson;
		
		
	}
	public static void main(String[] args) {
		
		int numberOfPeople = 5;
		List<String> peopleInLine = new ArrayList<String>();
		
		peopleInLine = addList(numberOfPeople);

//		StandingQueue();
		
		Iterator iterator = peopleInLine.iterator();
		
		while (iterator.hasNext() ) {
			
			System.out.println(iterator.next());
		}
		
		System.out.println(peopleInLine);
		
	
	}

}
