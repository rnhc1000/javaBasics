/**
 *
 */
package packageLeetCodePalindrome;

import jdk.jfr.Description;

import java.util.*;

/**
 * @auth rnhc1
 * <p>
 * Algorithm: Two Pointers
 */
@Description ("Check if a string can be palindrome")
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
    int[] request = {1, 2, 3, 4, 4, 9, 56, 90};
    int t = 8;
    int[] response = new int[2];
    response = twoSum(request, t);
    for (int b : response) {
      System.out.println(b);
    }

//    hackerRankSet();

    char[] chars = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'
    };

    char[] characters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z'
    };

    // Printer myPrint = new Palindrome.Printer();

    // Arrays.sort
    returnFrequencyOfCharacters(characters);

    String sx = "111000";
    int resp = minSwaps(sx);
    System.out.println(resp);
  }

  public static void returnFrequencyOfCharacters(char[] ch) {

    int[] frequency = new int[26];
    int count = 0;
    char indicator = 'a';
    for (char c : ch) {

      frequency[c - 'a']++;

    }

//    Arrays.sort(frequency);

    System.out.println(Arrays.toString(frequency));

    String[] string = {
            "The quick brown fox dog jumps over the lazy dog",
            "There are a lot of new features to be explored on this new tech stack",
            "why on earth there are people so idiot as these leftists"
    };
    returnFrequencyOfWords(string);
  }

  public static void returnFrequencyOfWords(String[] words) {

    int quantityOfWords = words.length;
    String regex = "\\s+";
    Map<String, Integer> map = new LinkedHashMap<>();
    for (String word : words) {
      String[] wrd = word.split(regex);
      for (String w : wrd) {
        w = w.toLowerCase();
        map.put(w, map.getOrDefault((w), 0) + 1);
      }
    }

    System.out.println(map);
  }

  public static int minSwaps(String s) {
    int ones = 0, zeroes = 0;

    for (char c : s.toCharArray()) {
      if (c == '1') {
        ones++;
      } else {
        zeroes++;
      }
    }
// Solving this problem will be impossible if difference between number of ones
// and number of zeros will be greater than 1.
    if (Math.abs(ones - zeroes) > 1) return -1;

    // the string can start with one or zero

    if (ones > zeroes) {
      return helper(s, '1');
    } else if (zeroes > ones) {
      return helper(s, '0');
    }

    return Math.min(helper(s, '0'), helper(s, '1'));
  }


  public static int helper(String s, char c) {
    int swap = 0;
    for (char ch : s.toCharArray()) {

      if (ch != c) {
        swap += 1;
      }
      c ^= 1;
    }
    return swap / 2;
  }
}

