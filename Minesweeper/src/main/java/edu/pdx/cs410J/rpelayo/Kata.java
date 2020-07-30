package edu.pdx.cs410J.rpelayo;

import java.io.*;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
  public static void main(String[] args) {
    try {
      String fileName = "Data.txt";
      File file = null;
      FileReader fReader = null;
      BufferedReader bReader = null;

      file = new File(fileName);
      fReader = new FileReader(file);
      bReader = new BufferedReader(fReader);

      int row = Integer.parseInt(bReader.readLine());
      int column = Integer.parseInt(bReader.readLine());
      String board[] = new String[row];

      for (int i = 0; i < row; ++row) {
        board[i] = bReader.readLine();
      }
      System.out.println(board);



    }
    catch(Exception e){ }
  }
}
