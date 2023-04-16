/**
 * 
 */
package packageCustomObjects;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author rnhc1
 *
 */
public class SetAndKeyInMaps {
	
	public static void main(String[] args) {
		
		Person personOne = new Person(1, "Ricardo");
		Person personTwo = new Person(2, "Perpétua");
		Person personThree = new Person(3, "Camilla");
		Person personFour = new Person(4, "Nathalia");
		Person personFive = new Person(5, "Henrique");
		Person personSix = new Person(1, "Ricardo");
		
		Map<Person, Integer> mapPerson = new LinkedHashMap<Person,Integer>();
		
		mapPerson.put(personOne, 1);
		mapPerson.put(personTwo, 2);
		mapPerson.put(personThree, 3);
		mapPerson.put(personFour, 4);
		mapPerson.put(personFive, 5);
		mapPerson.put(personSix, 1);
		
		// personSix and personOne are the same
		// we do need dot equals and dot hashcode mehods
		// to have unique objects
		
		

		for(Person key: mapPerson.keySet()) {
			
			System.out.println(key);
		}
		
//		[1: Ricardo, 2: Perpétua, 3: Camilla, 4: Nathalia, 5: Henrique, 1: Ricardo]

		
		//System.out.println(mapPerson);
		
		Set<Person> setPerson = new LinkedHashSet<Person>();
		
		setPerson.add(personOne);
		setPerson.add(personTwo);
		setPerson.add(personThree);
		setPerson.add(personFour);
		setPerson.add(personFive);
		setPerson.add(personSix);
		
		System.out.println(setPerson);
		//[1: Ricardo, 2: Perpétua, 3: Camilla, 4: Nathalia, 5: Henrique, 1: Ricardo]

		/**
		 * 
		 * After using dot equals and dot hashcode
		 * only unique values are present both at
		 * set and map structures
		 */


		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		
		
		for(String key: map.keySet() ) {
			System.out.println(key + ": " + map.get(key));
		}
		
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("dog");
		set.add("cat");
		
	}

}
