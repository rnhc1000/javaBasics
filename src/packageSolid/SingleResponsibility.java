/**
 * 
 */
package packageSolid;

/**
 * @author rnhc1
 * Source: https://www.freecodecamp.org/news/solid-principles-for-better-software-design/
 *
 */
public class SingleResponsibility {
	/**
	 * 
	 * Class Invoice violates the SRP because has many different responsibilities
	 * such as save Invoice to a Database and print a copy of it... If u have to
	 * save the invoice to a file the Invoice class would have to be rewritten
	 *
	 */
	class Marker {
		String name;
		String color;
		int price;

		public Marker(String name, String color, int price) {
			this.name = name;
			this.color = color;
			this.price = price;
		}
	}

	class Invoice {
		private Marker marker;
		private int quantity;

		public Invoice(Marker marker, int quantity) {
			this.marker = marker;
			this.quantity = quantity;
		}

		public int calculateTotal() {
			return marker.price * this.quantity;
		}

		public void printInvoice() {
			// printing implementation
		}

		public void saveToDb() {
			// save to database implementation
		}
	}

	/**
	 * 
	 * SRP for the Invoice Class Only the info needed and nothing else...Marker,
	 * Quantity and Total
	 *
	 */
	class InvoiceSRP {
		private Marker marker;
		private int quantity;

		public InvoiceSRP(Marker marker, int quantity) {
			this.marker = marker;
			this.quantity = quantity;
		}

		public int calculateTotal() {
			return marker.price * this.quantity;
		}
	}

	class InvoiceDao {
		private Invoice invoice;

		public InvoiceDao(Invoice invoice) {
			this.invoice = invoice;
		}

		public void saveToDb() {
			// save to database implementation
		}
		
	}

	class InvoicePrinter {
		private Invoice invoice;

		public InvoicePrinter(Invoice invoice) {
			this.invoice = invoice;
		}

		public void printInvoice() {
			// printing implementation
		}
	}

}
