/**
 * 
 */
package packageCodeWarsOne;

/**
 * @author rnhc1
 *
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Isogram {

	public static boolean isIsogram(String str) {
		str = str.trim().toLowerCase();
		Set<Character> characters = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			Character character = str.charAt(i);
			if (!characters.contains(character)) {
				characters.add(character);
			} else {
				return false;
			}
		}
		return true;
	}
}
