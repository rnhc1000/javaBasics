package javaBasics;

class Frogg {
	
	private int id;
	private String name;
	
	public Frogg(int id, String name) {
		
		this.id = id;
		this.name = name;
		
	}
	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
//		return sb.toString();
		return String.format("%4d: %s", id, name);
	}
	
}
public class ToStringOne {

	public static void main(String[] args) {
		Frogg frogg = new Frogg(7, "Alice");
		System.out.println(frogg);

		
		String sb = frogg.toString();
		System.out.println(sb);


	}

}


/**
 * javaBasics.Frogg@1d251891
 * hashCode unique to each object in Java
*/
