import java.util.*;
import java.io.*;

class Fibonocci{
  public static int[] fib(int n){
    int [] fibo = new int[n+1];
    fibo[0] = 0;
    fibo[1] = 1;

    for(int i = 2; i <= n; ++i){
      fibo[i] = fibo[i-1] + fibo[i-2];
    }
    return fibo;
  }

  public static void main(String[] args){
    int[] p = fib(10);

    System.out.println("Fibonocci number => " + p);
    for(int j =0 ; j <= p.length ; j++)
      System.out.println(p[j]);
  }
}

