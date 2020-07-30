package edu.pdx.cs410J.rpelayo;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


<<<<<<< HEAD
    public static void main(String[] args) {
        System.err.println("Missing command line arguments");
        System.exit(1);
//        System.out.print(romanNumeralFor(args[0]));
    }

    public static String romanNumeralFor(int number) {
        String romanNumeral = "";

        // List of special cases
        int list[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // corresponding symbols
        String Roma[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        while(number>0) {
            for (int i = 0; i < list.length; i++) {
                if (number >= list[i]) {
                    romanNumeral += Roma[i];
                    number -= list[i];
                }
            }
        }
        return romanNumeral;
    }
=======
  public static String romanNumeralFor(int number) {

      String romanNumeral = "";

      // List of special cases
      int list[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
      // corresponding symbols
      String Roma[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
      int i = 0;
      while (number> 0) {
          for (; i < list.length; i++) {
              if (number >= list[i]) {
                  break;
              }
          }
          romanNumeral += Roma[i];
          number -= list[i];
      }
      return romanNumeral;

      /*int list[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
      String chars[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
      int i = 0;
      String out="";
      while(num > 0)
      {
          for(;i < list.length;i++)
              if(num >= list[i])
                  break;
          out+=chars[i];
          num -= list[i];
      }
      return out;*/
  }
>>>>>>> b07e5e365cfd7ba39c20d11efbe0ee0529f234bb
}