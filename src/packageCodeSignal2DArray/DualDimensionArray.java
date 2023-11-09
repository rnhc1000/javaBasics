package packageCodeSignal2DArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class DualDimensionArray {
	
	 static void start() 
	    {
	        long [] a1 = {3,4,5};
	        long [] a2 = fix(a1);
	        System.out.print(a1[0] + a1[1] + a1[2] + " ");
	        System.out.println(a2[0] + a2[1] + a2[2]);
	    }

	   static long [] fix(long [] a3) 
	    {
	        a3[1] = 7;
	        return a3;
	    }

	public static void main(String[] args) {

//		int rows = 4;
//		int columns = 4;
//		int[][] array = new int[rows][columns];
//		int value = 1;
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < columns; j++) {
//				array[i][j] = value;
//				value++;
//			}
//		}
//
//		System.out.println("2D Array is ");
//
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.print("\n");
//		}
		Set<String> addingSet = new HashSet<String>();
//
		List<String> adding = new ArrayList<String>();
		List<String> exists = new ArrayList<String>();
		String qq[][] = { { "ADD", "1" }, { "ADD", "2" }, { "ADD", "3" }, { "ADD", "2" }, { "EXISTS", "2" },
				{ "EXISTS", "2" }, { "EXISTS", "5" }, { "EXISTS", "1" }, { "EXISTS", "4" }, { "EXISTS", "3" },
				{ "EXISTS", "0" }, };
		// Map mapItems = Arrays.utils.toMap(queries);

//		String[] resp = new String[response.size()];
//		return response.toArray(resp);

		String queries[][] = { { "EXISTS", "0" }, { "EXISTS", "10" }, { "ADD", "2" }, { "ADD", "3" }, { "ADD", "9" },
				{ "EXISTS", "3" }, { "EXISTS", "4" }, { "EXISTS", "9" }, { "EXISTS", "10" }, { "ADD", "10" },
				{ "ADD", "0" }, { "EXISTS", "0" }, { "EXISTS", "1" }, { "EXISTS", "2" }, { "EXISTS", "3" },
				{ "EXISTS", "4" }, { "EXISTS", "9" }, { "EXISTS", "10" }, { "EXISTS", "11" } };

		String qqq[][] = { { "ADD", "1" }, { "ADD", "2" }, { "ADD", "2" }, { "ADD", "3" }, { "EXISTS", "1" },
				{ "EXISTS", "2" }, { "EXISTS", "3" }, { "REMOVE", "2" }, { "REMOVE", "1" }, { "EXISTS", "2" },
				{ "EXISTS", "1" } };

		String qqqq[][] = { { "ADD", "1" }, { "ADD", "2" }, { "ADD", "2" }, { "ADD", "4" }, { "GET_NEXT", "1" },
				{ "GET_NEXT", "2" }, { "GET_NEXT", "3" }, { "GET_NEXT", "4" }, { "REMOVE", "2" }, { "GET_NEXT", "1" },
				{ "GET_NEXT", "2" }, { "GET_NEXT", "3" },{ "GET_NEXT", "4" },};

		/**
		 * Instantiate class Compare2DArray
		 */
		Compare2DRandomArray compare2DArray = new Compare2DRandomArray();

		List<String> response = new ArrayList<String>();

		response = compare2DArray.compareArraysRandom(qqqq);
		
		System.out.print("solution(queries) = " + response);
		
		Deque<String> stack = new ArrayDeque<String>();
		
		
		
		

//		for (String[] innerArray : queries) {
//			for (String v : innerArray) {
//				System.out.print(v + " ");
//			}
//			System.out.print("\n");
//		}

		// List<String> response = new ArrayList<String>();

//		int idxSet = 0;
//		int idxArray = 0;
//		for (int i = 0; i < queries.length; i++) {
//			for (int j = 0; j < queries[i].length; j++) {
//				 //System.out.print(queries[i][j] + " ");
//				 //adding.add(queries[i][j]);
//
//				if (queries[i][j].equals("ADD")) {
//					adding.add(queries[i][j + 1]);
////					exists.add("G");
//					response.add("\" \"");
//
//				} else if (queries[i][j].equals("EXISTS")) {
////					adding.add("F");
//
//					exists.add(queries[i][j + 1]);
//					if (adding.contains(queries[i][j+1])) {
////						idxSet =  adding.indexOf(existed[i]);
//
//					response.add("true");
//					} else {
//						response.add("false");
//					}
////					for (String x : adding) {
////						if (exists.get(i) == x) {
////							
////							response.add("true");
////						} else {
////							response.add("false");
////						}
//////						
////					}
//
//				}
//			}
//			//System.out.println();
//
//		}
//		System.out.println("BasisContainer " + adding);
//		System.out.println("ComparedContainer " + exists);
////		System.out.println(response);
////		// String added [] = adding.toArray(new added[0]);
////
//		String added[] = new String[addingSet.size()];
//		addingSet.toArray(added);
//
//		Arrays.sort(added);
//		//System.out.println(Arrays.toString(added));
//
//		String existed[] = new String[exists.size()];
//		exists.toArray(existed);

//		boolean f = false;
//		for (int i = 0; i < existed.length; i++) {
//			if (adding.contains(existed[i])) {
//				idxSet =  adding.indexOf(existed[i]);
//				if (i <= idxSet ) {
//					response.add("false");
//				} else {
//					response.add("true");
//				}
////				f = true;
////				response.add("true");
////				System.out.print(f + " ");
//				continue;
////
//			} else {
//				f = false;
//				response.add("false");
//				//System.out.print(f + " ");
//			}
////
////		}
//		List<String> diff = new ArrayList<String>();
//
//		int sizeOfAdded = addingSet.size();
//		int sizeOfExists = existed.length;

		// Arrays.eq

//		Iterator iterator = exists.iterator();
//		while(iterator.hasNext() ) {
//			Object e = iterator.next();
//			
//			for (String x: adding) {
//				
//			System.out.print(x.contains((CharSequence) e));
//			}
////			System.out.print(e + " ");
//			
//			
//			
//		}

		// if (exists.contains(adding))

//		Map<String, String> map = new HashMap<String, String>();
//		int m=0;
//		int n=1;
//		for (String[] ix : queries) {
//
//			System.out.println(ix[m]+ " "+ix[n]);
//			map.put(ix[m], ix[n]);
//			m+=2;
//			n+=2;
//		}

//		for (int k=0; k<adding.size()-1; k++) {
//			
//			map.put(adding.get(k),adding.get(++k));
//			System.out.println(k);
//			System.out.println(map);
//			
//			
//		}
		//
//		[1, 2, 5, 2]
//				[2, 5, 1, 4, 3, 0]
//				[4, 3, 0]

		// List<String> difference = exists.stream().filter(item ->
		// adding.contains(item)).toList();
		// System.out.println("Diff " + difference);
		// adding.removeAll(exists);

		// System.out.println(exists);
//		List<String> diff = new ArrayList<String>(exists);
//		//diff.removeAll(adding); [4,3,0]
//		diff.retainAll(adding );
//		

		// for (String exist: exists) {
//	
//		int idxSet = 0;
//		int idxArray = 0;
//		boolean f = false;
//		for (int i = 0; i < existed.length; i++) {
//			if (adding.contains(existed[i])) {
//				idxSet =  adding.indexOf(existed[i]);
//				if (i <= idxSet ) {
//					response.add("false");
//				} else {
//					response.add("true");
//				}
////				f = true;
////				response.add("true");
////				System.out.print(f + " ");
//				continue;
////
//			} else {
//				f = false;
//				response.add("false");
//				//System.out.print(f + " ");
//			}
////
//		}
		// }
//		for (String addin : adding) {
//			boolean found = false;
//			for(String exist : exists) {
//				if(exist.contains(addin)) {
//					found=true;
//					System.out.print(exist + " " + found+ "\n");
//					continue;
//				} else {
//					found = false;
//					System.out.print(exist + " " + found+"\n");
//					continue;
//				}
//			}
//			
//		}

//		String pattern = exists.stream()
//			      .map(Pattern::quote)
//			      .collect(Collectors.joining("|", ".*(", ").*"));
//	 
//			Pattern re = Pattern.compile(pattern);
//	 
//			 adding.stream().allMatch(t -> re.matcher(t).matches());
//			 System.out.println(adding);

		// System.out.println(response);
//
//		String[] arr = new String[] { "Ricardo", "Ferreira", "Ricardo" };
//		String search = "Ricardo";
//		Stream<String> doesContain = Arrays.stream(arr).filter(x -> x.equals(search));
//
//		// String[] ax = new String[(int) doesContain.count()];
//		doesContain.forEach(s -> System.out.print(s));
//		List<Integer> numbers =  Arrays.asList(1,2,3,4,5);
//		int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n->n*2).sum();
//		System.out.println(sum);

		
		double n = -9.0;
		
		System.out.println(Math.sqrt(n));
		  start();
		  
		    Float f1 = new Float("3.0");
		    int x = f1.intValue();
		    byte b = f1.byteValue();
		    double d = f1.doubleValue();
		    System.out.println(x + b + d);
	}

}

/*
 *
 * [ "false", "false", "", "", "", "true", "false", "true", "false", "", "",
 * "true", "false", "true", "true", "false", "true", "true", "false" ]
 */
