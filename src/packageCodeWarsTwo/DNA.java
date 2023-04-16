/**
 * 
 */
package packageCodeWarsTwo;

/**
 * @author rnhc1
 * [ 'T_T', ':D', ':|', ':)', ':(' ]
 *
 */
import java.util.HashMap;
import java.util.stream.Collectors;
public class DNA {
	
	  private static HashMap<Character, Character> map = new HashMap<>(4);
	  static {map.put('A', 'T'); map.put('T', 'A'); map.put('C', 'G'); map.put('G', 'C');}
	  public static String makeComplement(String dna) {
	    return dna.chars().mapToObj(c -> String.valueOf(map.get((char)c))).collect(Collectors.joining());
	  }
	

	public static String complementoDNA(String str) {

		char t = 'T';
		char a = 'A';
		char c = 'C';
		char g = 'G';
		String complemento = "";
		
		int len = str.length();
		String sanitizedStr = str.trim().toUpperCase();
		
		for (int i = 0; i < len; i++ ) {
			
			switch (sanitizedStr.charAt(i)) {
			
			case 'A':
				complemento=complemento + t;
				break;
			case 'T':
				complemento=complemento + a;
				break;
			case 'C':
				complemento=complemento + g;
				break;
			case 'G':
				complemento=complemento + c;
				break;
			}
		}
		
		return complemento;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dnaInformed = "GCTTG";
		System.out.println("DNA Informado -> " + dnaInformed + " -> " + "Complemento -> " + complementoDNA(dnaInformed));

	}

}
