package packageCodeSignal2DArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Compare2DArray {
	
	public List<String> compareArrays(String [][] queries) {
		
		
		List<String> response = new ArrayList<String>();
		Set<String>  adding   = new HashSet<String>();
		List<String> exists   = new ArrayList<String>();
		
		for(int i=0; i<queries.length; i++) {
			for(int j=0; j<queries[i].length;j++) {
				if (queries[i][j].equals("ADD")) {
					
					adding.add(queries[i][j+1]);
					response.add("\"\"");
					
				} else if (queries[i][j].equals("EXISTS")) {
						
					exists.add(queries[i][j+1]);
					
				}
			}
		}

		String existed[] = new String[exists.size()];
		exists.toArray(existed);
		for (int i = 0; i < existed.length; i++) {
			if (adding.contains(existed[i])) {
				response.add("true");
				continue;

			} else {
				response.add("false");
			}

		}		

		return response;
	}

}
