import java.util.*;
import java.io.*;

class BinomialCofficientRecursive{

  static int _binomialcofficient(int n, int k){
    if(k == 0 || k == n)
      return 1;
    else
      return (_binomialcofficient(n-1, k-1) + _binomialcofficient(n-1, k));
  }

  public static void main(String[] args){
    int n = 5;
    int k = 2;
    System.out.println("Binomial Cofficient Value => " + _binomialcofficient(n,k));

  }
}

