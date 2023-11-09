/**
 * 
 */
package packageLeetCodePalindrome;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @auth rnhc1
 * 
 *       Algorithm: Two Pointers
 *
 */

public class Palindrome {

  public static boolean isPalindrome(String s) {

    if (s != null) {

      if (s.length() < 2) {

        return false;
      }

      int pointerAscending = 0;
      int pointerDescending = s.length() - 1;
      System.out.println("S " + pointerDescending);

      while (pointerAscending < pointerDescending) {

        if (s.charAt(pointerAscending) != s.charAt(pointerDescending)) {
          System.out.println("Passagem A: " + pointerAscending);
          System.out.println("Passagem B: " + pointerDescending);
          return false;
        } else {
          System.out.println("Passagem A0 : " + pointerAscending);
          System.out.println("Passagem B0: " + pointerDescending);
          pointerAscending++;
          pointerDescending--;
          System.out.println("Passagem A1 : " + pointerAscending);
          System.out.println("Passagem B1: " + pointerDescending);

        }
        // pointerAscending++;
      }
      return true;
    }
    return false;
  }

  public static int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    int sumUp = 0;
    int sizeOfNumbers = numbers.length;
    for (int i = 0; i < sizeOfNumbers; i++) {
      for (int j = i + 1; j < sizeOfNumbers; j++) {
        System.out.println(sumUp);
        sumUp = numbers[i] + numbers[j];
        System.out.println("Sum: " + "i: " + i + " j: " + j);
        if (sumUp == target) {
          System.out.println("Soma OK " + "i: " + i + " j: " + j);
          result[0] = i + 1;
          result[1] = j + 1;
          return result;
        }
      }
    }
    return result;
  }

  public static int hackerRankSet() {

    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String[] pair_left = new String[t];
    String[] pair_right = new String[t];

    for (int i = 0; i < t; i++) {
      pair_left[i] = s.next();
      pair_right[i] = s.next();
    }

    for (String u : pair_left) {

      System.out.println(u);

    }
    for (String v : pair_right) {

      System.out.println(v);

    }

    Set<String> sx = new HashSet<String>();
    for (int i = 0; i < t; i++) {

      sx.add(pair_left[i] + " " + pair_right[i]);
      System.out.println(sx.size());
    }
    System.out.println(sx.size());
    for (String x : sx) {
      System.out.println(x);
    }
    return 10;

  }

  class Printer {
    // Generics methods
    public Printer() {
    }

    public <T> void printArray(T[] element) {

      for (T s : element) {

        System.out.println(s);
      }
    }

  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] a = new int[10];

    System.out.println(a.length);
    String s = "anana";
    if (isPalindrome(s)) {

      System.out.println(s + " is Palindrome!");
    } else {
      System.out.println(s + " is not Palindrome....");
    }
    int[] request = { 1, 2, 3, 4, 4, 9, 56, 90 };
    int t = 8;
    int[] response = new int[2];
    response = twoSum(request, t);
    for (int b : response) {
      System.out.println(b);
    }

    hackerRankSet();

    // Printer myPrint = new Palindrome.Printer();

    // Arrays.sort
  }

}
