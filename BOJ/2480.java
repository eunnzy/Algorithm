import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    int prize = 0; 
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    if(a == b && b == c) {  // a == b == c
      prize = 10000 + a * 1000;
    }else if (a==b || b==c) { // a == b || b == c
      prize = 1000 + b * 100;
    }else if (a == c) { 
      prize = 1000 + a * 100;
    }else {
      prize = Math.max(Math.max(a, b), c) * 100;
    }

    System.out.println(prize);
    
  }
}
