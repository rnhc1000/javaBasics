/**
 * 
 */
package packageFour;

/**
 * @author rnhc1
 *
 */
public class CastingOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte byteValue = 20; //byte - 8bits
		short shortValue = 55; // short - 16 bits
		int intValue = 100; // int - 32 bits
		long longValue = 23555; // long	 - 64 bits
		float floatValue = 8834.50f; //float - 32 bits;
		double doubleValue = 56789.94; // double - 64 bits;
		
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		intValue = (int)longValue;
		/**
		 * There is no need to cast
		 * because there are not chopping off values;;
		 * 
		 * double is larger than int ( 64 vs 32)
		 */
		doubleValue = intValue;
		
		System.out.println(intValue);
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		
		System.out.println(intValue);
		System.out.println(floatValue);
		
		double res = Math.floor(floatValue);
		
		
		System.out.println(res);
		
		
	}

}
