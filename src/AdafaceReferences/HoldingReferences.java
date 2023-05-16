package AdafaceReferences;

public class HoldingReferences {
	
	int id;
	HoldingReferences x;
	public HoldingReferences(int amount, HoldingReferences h) {
		id = amount;
		x = this;
		if (h != null) x = h;
	}
	void go(HoldingReferences h2) {
		HoldingReferences h3 = new HoldingReferences(2, h2);
		HoldingReferences h4 = new HoldingReferences(3, h3);
		System.out.println(h3.x.x);
		System.out.println(h4.x.x.id);
		
	}

	public static void main(String[] args) {
		HoldingReferences h1 = new HoldingReferences(5, null);
		h1.go(h1);

	}

}
 