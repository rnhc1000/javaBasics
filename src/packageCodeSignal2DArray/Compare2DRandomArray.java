package packageCodeSignal2DArray;

import java.util.ArrayList;
import java.util.List;

public class Compare2DRandomArray {
	
	public List<String> compareArraysRandom(String[][] queries) {

		List<String> response = new ArrayList<String>();
		List<String>  adding   = new ArrayList<String>();

		for (int i = 0; i < queries.length; i++) {
			
			for (int j = 0; j < queries[i].length; j++) {

				if (queries[i][j].equals("ADD")) {
					
					adding.add(queries[i][j + 1]);
					
					response.add("\" \"");

				} else if (queries[i][j].equals("EXISTS")) {

					if (adding.contains(queries[i][j + 1])) {

						response.add("true");
						
					} else {
						
						response.add("false");
					}
				} else if (queries[i][j].equals("REMOVE")) {
					
					if (adding.contains(queries[i][j+1])) {
						adding.remove(queries[i][j+1]);
						response.add("true");
					} else {
						response.add("false");
					}
				} else if (queries[i][j].equals("GET_NEXT")) {
					
					String partial = queries[i][j+1];
					
												
					if (adding.contains(partial)) {
						
						response.add(partial);
											
					} else {
						response.add("\" \"");
					}
				}
			}
		}
		
		return response;
	}
}
