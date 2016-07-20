import java.util.*;
import java.io.*;

class LCSDynamic{

  public static int _lcs(String s1, String s2, int m, int n){
    
    int arr[][] = new int [m + 1][n + 1];
    int i, j;
    for(i = 0; i <= m; i++){
      for(j = 0; j <= n; j++){
        if(i == 0 || j == 0)
          arr[i][j] = 0;
        else if(s1.charAt(i-1) == s2.charAt(j-1)){
          arr[i][j] = 1 + arr[i-1][j-1];
        }
        else{
          arr[i][j] = max(arr[i-1][j], arr[i][j-1]);
        }
      }
    }
    return arr[m][n];
  }

  public static int max( int a, int b){
    return (a > b) ? a:b;
  }

  public static void main(String[] args){
    String s1 = "AGGTAB";
    String s2 = "GXTXAYB";
    int m = s1.length();
    int n = s2.length();

    System.out.println("Length of Longest Common Subsequence -> " + _lcs(s1,s2,m,n));
  }
}

