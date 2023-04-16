/**
 * 
 */
package packageDome;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/**
 * @author rnhc1
 *
 */
public class Teste {

}



interface AlertDAO {
    public int raiseAlert();
      
    
    public Date getAlertTime();
}

class AlertService {
    
    public void AlertService(Object AlertDAO) {
        
    }
    private final MapAlertDAO storage = new MapAlertDAO();
		
    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }
	
    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }	
}

//class MapAlertDAO implements AlertDAO {
//    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();
//	
//    public UUID addAlert(Date time) {
//    	UUID id = UUID.randomUUID();
//        this.alerts.put(id, time);
//        return id;
//    }
//	
//    public Date getAlert(UUID id) {
//        return this.alerts.get(id);
//    }	
//}