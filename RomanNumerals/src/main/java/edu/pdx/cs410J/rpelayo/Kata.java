package edu.pdx.cs410J.rpelayo;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static String romanNumeralFor(int number){
    /*
    I(1)，V(5)，X(10)，L(50)，C(100)，D(500)，M(1000)
     */
    public String intToRoman(int num) {
      int list[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
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
      return out;
    }

    String[] Roma={"I","II","III","IV","V"};
    for(int i=0;i<10;i++){
      if(i+1==number){
        return Roma[i];
      }
    }
    return null;
  }
}