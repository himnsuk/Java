import java.util.*;
import java.io.*;

class LCSRecursion{

  public static int _lcs(String s1, String s2, int m, int n){
    
    if(m ==0 || n == 0)
      return 0;
    if(s1.charAt(m-1) == s2.charAt(n-1))
      return 1 + _lcs(s1, s2, m-1, n-1);
    else
      return max(_lcs(s1, s2, m, n-1), _lcs(s1,s2, m-1, n));
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

