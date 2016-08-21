import java.util.*;
import java.io.*;

class MaxSumPath{

  public static void sumPath(int ar1[], int ar2[]){
    int n1 = ar1.length;
    int n2 = ar2.length;
    int sum1 = 0, sum2 = 0;
    int res = 0;
    int i = 0, j = 0;
    while(i < n1 && j < n2){
      if(ar1[i] == ar2[j]){
        sum1 += ar1[i];
        sum2 += ar2[j];
        if(sum1 > sum2){
          res += sum1;
        }
        else{
          res += sum2;
        }
        sum1 = 0;
        sum2 = 0;
      } 
      else{
        sum1 += ar1[i];
        sum2 += ar2[j];
      }
      i++;
      j++;
    }
    res += sum1 > sum2 ? sum1 : sum2;
    System.out.println(res);
  }
  public static void main(String[] args) 
  {
    int ar1[] = {2, 3, 7, 10, 12, 15, 30, 34};
    int ar2[] = {1, 5, 7, 8, 10, 15, 16, 19};
    sumPath(ar1, ar2);
  }
}
