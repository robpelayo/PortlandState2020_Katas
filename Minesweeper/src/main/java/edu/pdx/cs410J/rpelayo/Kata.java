package edu.pdx.cs410J.rpelayo;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static void main(String[] args) {
    int row = Integer.parseInt(args[0]);
    int col = Integer.parseInt(args[2]);
    if (row < 0 || row > 100 || col < 0 || col > 100) {
      System.err.println("Wrong input");
      System.exit(1);
    }


  }
}