import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    String[] dial = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
    
    String str = scanner.next();
    int sum = 0;
    
    for(int i=0; i<str.length(); i++) {
      for(int j=0; j<dial.length; j++) {
        if(dial[j].contains(String.valueOf(str.charAt(i)))) {
          sum += j + 1;
        }
      }      
    }

    System.out.println(sum);
  }
}
