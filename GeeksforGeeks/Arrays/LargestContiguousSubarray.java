import java.util.*;
import java.io.*;

public class LargestContiguousSubarray{
  public static int maxContiguous(int arr[]){
    int count = 1, max_count = 1;
    for(int i = 0; i < arr.length - 1; i++){
      if(arr[i]+1 == arr[i+1] && i < arr.length - 1){
        count++;
      }else{
        if(max_count < count){
          max_count = count;
        }
        count = 1;
      }
    }
    if(max_count < count){
      max_count = count;
    }
    return max_count;
  }
  public static void quickSort(int arr[], int l, int r){
    if( l < r){
      int pi = partition(arr, l, r);
      quickSort(arr, l, pi - 1);
      quickSort(arr, pi + 1, r);
    }
  }

  public static int partition(int arr[], int left, int right){
    int pivot = arr[right];
    int i = left - 1;
    for(int j = left; j <= right -1; j++){
      if(arr[j] <= pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[right];
    arr[right] = temp;
    return i+1;
  }

  public static void printArray(int arr[]){
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }

  public static void main(String[] args){
    // int arr[] = {3, 7, 8, 5, 2, 1, 9, 5, 4};
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = arr.length;
    printArray(arr);
    quickSort(arr, 0, n - 1);
    printArray(arr);
    System.out.println(maxContiguous(arr));
  }
}
