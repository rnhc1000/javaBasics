/**
 * 
 */
package packageSolid;

import packageSolid.SingleResponsibility.InvoiceSRP;

/**
 * @author rnhc1
 *
 */
public class OpenClosed {
	/**
	 * 
	 * InvoiceDAO has a SRP to 
	 * persist invoices at a database.
	 * What if there is a request to save it to a file?
	 * All code using the class should be changed as well 
	 * to accommodate the new feature what violates the OCP because
	 * we have to modify an existent code...
	 * 
	 */
	class InvoiceDao {
	    private InvoiceSRP invoice;

	    public InvoiceDao(InvoiceSRP invoice) {
	        this.invoice = invoice;
	    }

	    public void saveToDb() {
	        // save to database implementation
	    }
	    
	    public void saveToFile(InvoiceFile invoiceFile) {
	    	
	    }
	}
	
	/**
	 * The solution would be to have an interface that would
	 * separate the two actions
	 * save the invoice to a database
	 * save the invoice to a file 
	 */
	
	class DatabaseInvoiceDao implements InvoiceFactory {
		
		public void save(InvoiceSRP invoice) {
			//save to a database
		}	
	}
	
	class FileInvoiceDao implements InvoiceFactory {
		public void save(InvoiceSRP invoice) {
			// save to a file
		}
	}	
}

/**
* this is how we respect the OCP
* InvoiceFactory is open to extension
* and not to modification
*/