import java.util.*;
import java.io.*;

class ConsecutiveNumber{
  static void consecutive_number(int arr[]){
    int n = arr.length;
    int sum = 0;
    int leftSum = 0;

    for(int i = 0; i < n; i++)
    {
      sum += arr[i];
    }

    for(int j = 0; j < n; j++){
      sum -= arr[j];
      if(leftSum == sum){
        System.out.println(j);
      }
      leftSum += arr[j];
    }
  }

  static void printArray(int arr[]){
    for(int p = 0; p < arr.length; p++){
      System.out.print(arr[p] + ", ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    int[] arr = {-7, 1, 5, 2, -4, 3, 0};
    printArray(arr);
    consecutive_number(arr);
  }
}
