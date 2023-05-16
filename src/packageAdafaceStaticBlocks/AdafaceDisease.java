package packageAdafaceStaticBlocks;

class Disease {
	static { System.out.print("A " ); }
	
	public Disease() {
		System.out.print("B ");
	}
	
}

class Cancer extends Disease {
	static { System.out.print("C "); }
	public Cancer() {
		System.out.print("D ");
	}
	{ System.out.print("E "); }
	static {System.out.print("F "); }
	
}

public class AdafaceDisease extends Cancer {
	
	public static void main(String[] args) {
		System.out.print("G ");
		new AdafaceDisease();
		System.out.print("H ");
	}

}
