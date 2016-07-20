import java.util.*;
import java.io.*;

class CoinChange{

  static int _coinchange(int S[], int m, int n){
    int arr[][] = new int [m+1][n+1];
    
    for(int i = 0; i <= m; i++){
      arr[0][i] = 1;
    }

    for(int i = 1; i <= m; i++){
      for(int j = 0; j <= n; j++){
        int x = (i - S[j] > 0) ? arr[i - S[j]][j]:0;

        int y = (j >= 1) ? arr[i][j-1]: 0;

        arr[i][j] = x + y;
      }
    }
    return arr[m][n];
  }

  public static void main(String[] args){
    int[] S = {1, 2, 3};
    int m = S.length;
    int n = 4;
    System.out.println("Number of Permutation => " + _coinchange(S, m, n));

  }
}

