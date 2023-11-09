package packageInterfaces;


abstract interface Message {
	public void display(String msg);
}

public class AdaFaceInterface implements Message {
	
	public void display(Integer number) {
		
		System.out.println("Number " + number);
	}
	
	public void display(String msg) {
		System.out.println("String " + msg);
	}

	public static void main(String[] args) {
		
		AdaFaceInterface adaFaceInterface = new AdaFaceInterface();
		
		adaFaceInterface.display(2);
		adaFaceInterface.display("Test");
		

	}

}
