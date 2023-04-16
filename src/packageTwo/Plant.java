/**
 * 
 */
package packageTwo;

/**
 * @author rnhc1
 *
 */
public class Plant {
	
	/**
	 * Public modifier allow access form anywhere
	 * Do not declare instance variables as PUBLIC
	 * The access to data must be controlled
	 */
	public String name;
	
	/**
	 * The data can not be changed
	 * Acceptable, it´s final
	 * 
	 */
	public final static int id = 0;
	/**
	 * Private modifier means the variable
	 * is accessible only in the class
	 * it was declared!
	 */
	
	private String type;
	public Plant() {

	}
	public Plant(String name, String type) {
		this.setName(name);
		this.setType(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
