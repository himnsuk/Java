import java.util.*;
import java.io.*;

class MaximumProductSubarray{
  public static int min(int a, int b){
    return a < b ? a : b;
  }

  public static int max(int a, int b){
    return a > b ? a : b;
  }

  public static int maxProductSubarray(int arr[]){
    int n = arr.length;

    int maximum = 1;
    int minimum = 1;
    int max_val_till = 1;

    for( int i =0; i < n; i++){

      if(arr[i] > 0){
        maximum = maximum * arr[i];
        minimum = min(minimum * arr[i], 1);
      }

      else if( arr[i] == 0){
        maximum = 1;
        minimum = 1;
      }
      else{
        int temp = maximum;
        maximum = max(minimum * arr[i], 1);
        minimum = temp * arr[i];
      }

      if( max_val_till < maximum){
        max_val_till = maximum;
      }
    }

    return max_val_till;
  }

  public static void printArray(int arr[]){
    int n = arr.length;

    for(int i =0; i < n; i++){
      System.out.print(arr[i] + ", ");
    }
  }

  public static void main(String[] args){
    int[] arr = {6, -3, -10, 0, 2};
    printArray(arr);
    System.out.println(maxProductSubarray(arr));
  }
}


