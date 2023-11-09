/**
 * 
 */
package packageSolidOpenClosed;

/**
 * @author rnhc1
 *
 */
public class FootballRole {
	
	protected String role;
	
	FootballRole() {
		
	}
	
	FootballRole(String role) {
		this.role = role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return this.role;
	}

}
