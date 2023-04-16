/**
 * 
 */
package packageCustomObjects;

import java.util.Objects;

/**
 * @author rnhc1
 *
 */
public class Person {
	
	private int id;
	
	private String name;
	
	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		
		return id + ": " + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

}
