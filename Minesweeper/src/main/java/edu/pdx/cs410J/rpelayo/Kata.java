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
      int board_result[][] = new int[row][column];

      for (int i = 0; i < row; ++i) {
        board[i] = bReader.readLine();
      }
      System.out.println(board);

      for(int i = 0; i < row; ++i){
        for(int j = 0; j < column; ++j){
          board_result[i][j] = 0;
        }
      }

      for(int i = 0; i < row; ++i){
        for(int j = 0; j < column; ++j){
          if(board[i].charAt(j) == '*')
          {
            board_result[i - 1][j] += 1;
            board_result[i + 1][j] += 1;
            board_result[i][j + 1] += 1;
            board_result[i][j - 1] = -1;
          }
          if(board[i].charAt(j) == '.')
          {
            board_result[i][j] = 0;
          }
        }
      }
    }
    catch(Exception e){ }
  }


}
