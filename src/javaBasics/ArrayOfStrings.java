package javaBasics;

import static java.lang.Integer.parseInt;

public class ArrayOfStrings {

  public static void main(String[] args) {

    String[] fruits = {"apple", "banana", "strawberry"};

    String[][] scores = {
            {"Ricardo", "87"},
            {"Ricardo", "85"},
            {"Alves", "85"},
            {"Silva", "85"}
    };
    int row = 0;
    int n = 0;
    int scoresLength = scores.length;
    int eachScoresRowLength=0;
    int count = 0;
    int average = 0;

    //System.out.println(scoresLength);
    for (row = 0; row < scoresLength; row++) {
      eachScoresRowLength = scores[row].length;
      for (int j = 0; j < eachScoresRowLength; j++) {
        //System.out.print(scores[row][j] + " ");

        if (scores[row][0].equals(scores[row+1][0])) {
          System.out.println("OK... iguais");

        } else {

        }
      }
      System.out.println(" ");
    }
    average = parseInt(scores[0][1]);
    System.out.println(average);
    for (String fruit : fruits) {

      System.out.println(fruit);
    }

  }

}
