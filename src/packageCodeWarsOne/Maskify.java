/**
 * 
 */
package packageCodeWarsOne;

/**
 * @author rnhc1
 *
 */
public class Maskify {

	/**
	 * @param args
	 */

	Maskify() {

	}

	public static boolean isIsogram(String str) {
		int lenStr = str.length();
		String sanitizedStr = str.toLowerCase();

		for (int i = 0; i < lenStr; i++) {

			for (int j = i + 1; j < lenStr; j++) {
				System.out.print(sanitizedStr.charAt(i) + " " + sanitizedStr.charAt(j) + " - ");

				if (Character.compare((sanitizedStr.charAt(i)), (sanitizedStr.charAt(j))) == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static String maskify(String str) {

		try {

			if (str.length() > 4) {
				String sanitizedStr = str.trim();
				int len = sanitizedStr.length();
				System.out.println(len);
				char mask = '#';
				String masked = "";
				String unmasked = str.substring(len - 4, len);
				System.out.println(unmasked);
				str = str.substring(0, len - 4);
				len = str.length();
				for (int i = 0; i < len; i++) {
					masked = str.replace(str.charAt(i), mask);
					str = masked;
					System.out.println(str);
				}
				return masked + unmasked;
			} else {
				throw new UnsupportedOperationException("Unimplemented");
			}
		} catch (UnsupportedOperationException e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(maskify("4566789"));

		System.out.println(isIsogram("Milson"));

	}

}
