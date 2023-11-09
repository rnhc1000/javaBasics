package packageCodingGameTwo;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 * 
 * @author rferreira
 * Linguagem do p
 * 
 * Para cada vogal em uma string, colocar a letra p e repeti-la em seguida
 * Ex: alex
 * R: apalepx
 *
 */
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int stringLength = string.length();
        
        char[] str = new char [stringLength];
        //definir a base de comparação
        String base = "aeiouAEIOU";
        
        List<Character> list = new ArrayList<>();
        
        for (int i=0; i< stringLength; i++) {
            str[i] = string.charAt(i);
            if(base.indexOf(str[i]) !=-1) {

                list.add(str[i]);
                list.add('p');
                list.add(str[i]);
                
            } else {
                list.add(str[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();

        for (Character ch : list) {
            sb.append(ch);
        }

    System.out.println(sb.toString());

    }

}

