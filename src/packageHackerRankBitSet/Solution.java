package packageHackerRankBitSet;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner input = new Scanner(System.in);
        // n -> size of bitset
        // m -> number of operations
        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();     
        BitSet setOne = new BitSet(n);
        BitSet setTwo = new BitSet(n);
            
        for (int i=0; i< m; i++)  {
            String op =  input.next();
            int bitOne = input.nextInt();
            int bitTwo = input.nextInt(); 
            // 1 1
            op = op.toUpperCase();

            switch(op) {
            
                case "AND": 
                	if (bitOne==1) {
                		setOne.and(setTwo);
                	} else {
                		setTwo.and(setOne);
                	}
                break;
     
                case "OR": 
                	
                    if (bitOne==1) {                   
                        setOne.or(setTwo);
                    } else {                  
                        setTwo.or(setOne);
                    }
                     
                break;
            
                case "SET":
                
                    if (bitOne==1){                   
                        setOne.set(bitTwo);
                    } else {                  
                        setTwo.set(bitTwo);
                    } 
                          
                break;
            
                case "FLIP":
            
                    if (bitOne==1){                   
                        setOne.flip(bitTwo);
                    } else {                  
                        setTwo.flip(bitTwo);
                    } 
                    
                break;   
                
                case "XOR":
                
                    if (bitOne==1){
                        setOne.xor(setTwo);
                   } else {                  
                        setTwo.xor(setOne);
                   }
            
                break; 
                
                default:

                break;
                          
            }
            System.out.println(setOne.cardinality() + " " + setTwo.cardinality());
        }
        input.close();
     
    }
}
