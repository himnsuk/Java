import java.util.*;
import java.io.*;
import java.lang.*;

class IncreasingSubsequence{

  public static void increasingSubsequence(int arr[]){
    int n = arr.length;
    int left = 0, middle = 1, right = 2;
    int max_product  = arr[left] * arr[middle] * arr[right];
    int max_product_till  = arr[left] * arr[middle] * arr[right];
    for( int i = 0; i < n ; i++){
      if(arr[i] > arr[left] && arr[i] < arr[middle] && i < middle && i < right){
        left = i;
      }

      if( arr[i] > arr[left] && arr[i] < arr[middle] && i > left && i < right){
        middle = i;
      }

      if( arr[i] > arr[middle] && arr[i] < arr[right] && i > middle){
        right = i;
      }

      max_product_till = arr[left] * arr[middle] * arr[right];

      if(max_product < max_product_till){
        max_product = max_product_till;
      }
    }
    System.out.println(max_product);
  }


  public static void printArray(int arr[]){
    int n = arr.length;
    for(int i = 0; i < n; i++){
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }


  public static void main(String[] args) throws java.lang.Exception
  {
    int arr[] = {6, 7, 8, 1, 2, 3, 9, 10};
    printArray(arr);
    increasingSubsequence(arr);
  }
}
