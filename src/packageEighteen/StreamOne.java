/**
 * 
 */
package packageEighteen;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author rnhc1
 *
 */
public class StreamOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Stream.of("Code", "Learn", "Hub")
//				 //.forEach(System.out::println); // this is exactly the same
//				.forEach(s -> System.out.println(s));
		Consumer<String> printer = System.out::println;
		Consumer<String> printAgainWithStars = s -> System.out.println(s + "*");
		
		Stream.of("C", "L", "H").forEach(printer.andThen(printAgainWithStars));

	}

}
