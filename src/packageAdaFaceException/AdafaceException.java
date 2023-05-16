package packageAdaFaceException;

class CustomException extends Exception {

	private static final Long serialVersionUID = 1L;
	int num;

	CustomException(int n) {
		num = n;
	}
	
public class AdafaceException {


		static void calculate (int n) throws CustomException {
			throw new CustomException(n);
		}

		public static void main(String[] args) {
			try {
				calculate(42);
			} catch (CustomException e) {
				System.out.println("Catch 22");
			}

		}

	}
}
