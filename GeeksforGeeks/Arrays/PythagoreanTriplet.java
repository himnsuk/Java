import java.util.*;
import java.io.*;
import java.lang.*;

public class PythagoreanTriplet{
  static void makeSquare(int arr[]){
    int n = arr.length;
    for(int i = 0; i < n; i++){
      arr[i] = arr[i]*arr[i];
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }

  static void quickSort(int arr[], int low, int high){
    if( low < high){
      int pivot = partition(arr, low, high);
      quickSort(arr, low, pivot-1);
      quickSort(arr, pivot + 1, high);
    }
  }

  static int partition(int arr[], int low, int high){
    int pivot = arr[high];
    int i = low-1;
    for(int j = low; j < high; j++){
      if( arr[j] <= pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp2 = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp2;
    return i+1;
  }

  public static void printArray(int arr[]){
    int n = arr.length;
    for(int i = 0; i < n; i++){
      System.out.print(arr[i] + ", ");
    }
    System.out.print("\n");
  }

  public static boolean findTriiplet(int arr[]){
    int n = arr.length;

    for(int i = n-1; i >= 2; i--){
      int l = 0;
      int r = i-1;
      while(l < r){
        if(arr[l] + arr[r] == arr[i])
          return true;
        if( arr[l] + arr[r] < arr[i])
          l++;
        else
          r--;

      }
    }
    return false;
  }
  public static void main(String[] args)
  {
    int arr[] = {3, 1, 4, 6, 5};
    int high = arr.length;
    int low = 0;
    printArray(arr);
    quickSort(arr, low, high - 1);
    printArray(arr);
    makeSquare(arr);
    printArray(arr);
    System.out.println(findTriiplet(arr));
  }
}
