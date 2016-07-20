import java.util.*;
import java.io.*;

class BinomialCofficientDynamic{

  static int min(int a, int b){
    return (a < b) ? a:b;
  }

  static int _binomialcofficient(int n, int k){
    int arr[][] = new int [n+1][k+1];

    for(int i = 0; i <= n; i++){
      for(int j = 0; j <= min(i,k); j++){
        if(j==0 || j == i)
          arr[i][j] = 1;
        else
          arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
      }
    }
    return arr[n][k];
  }

  public static void main(String[] args){
    int n = 5;
    int k = 2;
    System.out.println("Binomial Cofficient Value => " + _binomialcofficient(n,k));

  }
}

