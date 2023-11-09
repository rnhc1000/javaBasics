/**
 * 
 */
package packageSolid;

/**
 * @author rnhc1
 * The Dependency Inversion Principle (DIP) states that 
 * high-level modules should not depend on low-level modules, 
 * but both should depend on abstractions. 
 * Abstractions should not depend on details – 
 * details should depend on abstractions.
 * This principle aims to reduce coupling between modules, 
 * increase modularity, and make the code easier to maintain, 
 * test, and extend.
 *
 */
public class DependencyInversion {
	
	class WeatherTracker {
	    private String currentConditions;
	    private Emailer emailer;
	    // Attention to the link between two classes...
	    public WeatherTracker() {
	        this.emailer = new Emailer();
	    }

	    public void setCurrentConditions(String weatherDescription) {
	        this.currentConditions = weatherDescription;
	        if (weatherDescription == "rainy") {
	            emailer.sendEmail("It is rainy");
	        }
	    }
	}

	class Emailer {
	    public void sendEmail(String message) {
	        System.out.println("Email sent: " + message);
	    }
	}
	
	
	/**
	 * In this example, we created a Notifier interface 
	 * that defines the alertWeatherConditions method. 
	 * The WeatherTrackerOne class now depends on this 
	 * interface instead of the Emailer class,
	 *  making it possible to easily change the implementation 
	 *  and test the WeatherTracker class independently.
	 *  We also created two implementations of the Notifier interface, 
	 *  Emailer, and SMS, to demonstrate how you can change the 
	 *  implementation of the WeatherTracker class without 
	 *  affecting its behavior.
	 *
	 */
	
	interface Notifier {
	    public void alertWeatherConditions(String weatherDescription);
	}

	class WeatherTrackerOne {
	    private String currentConditions;
	    private Notifier notifier;

	    public WeatherTrackerOne(Notifier notifier) {
	        this.notifier = notifier;
	    }

	    public void setCurrentConditions(String weatherDescription) {
	        this.currentConditions = weatherDescription;
	        if (weatherDescription == "rainy") {
	            notifier.alertWeatherConditions("It is rainy");
	        }
	    }
	}

	class EmailerOne implements Notifier {
	    public void alertWeatherConditions(String weatherDescription) {
	        System.out.println("Email sent: " + weatherDescription);
	    }
	}

	class SMS implements Notifier {
	    public void alertWeatherConditions(String weatherDescription) {
	        System.out.println("SMS sent: " + weatherDescription);
	    }
	}
}
