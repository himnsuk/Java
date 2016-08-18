import java.util.*;
import java.io.*;
import java.lang.*;

class RearrangePosNeg{

  public static void rearrange(int arr[]){
    int n = arr.length;

    int left = -1;
    int i;

    for(i = 0; i < n - 1; i++){
      if( arr[i] < 0){
        left++;
        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;
      }
    }

    int pos = left + 1, neg = 0;
    System.out.println(left);
    while(pos < n && neg < pos && arr[neg] < 0){
      int temp = arr[neg];
      arr[neg] = arr[pos];
      arr[pos] = temp;
      pos++;
      neg += 2;
    }
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
    int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
    printArray(arr);
    rearrange(arr);
    printArray(arr);
  }
}

