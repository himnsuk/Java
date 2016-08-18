import java.util.*;
import java.io.*;

class SubArraySum{

  public static void subArraySum(int arr[], int sum){
    int n = arr.length;
    int i = 0,j, res = 0;
    res = arr[i];
    for(j = 1; j < n; j++){
      while(res > sum){
        res = res - arr[i];
        i++;
      }
      if(res == sum)
      {
        int temp = i;
        for(int k = temp; k < j; k++){
          System.out.print(arr[k] + ", ");
        }
        System.out.println();
      }
      if(j < n){
        res += arr[j];
      }
    }
  }

  public static void main(String[] args) throws java.lang.Exception
  {int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
    int sum = 23;
    subArraySum(arr, sum);
  }
}
