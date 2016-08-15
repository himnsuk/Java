import java.util.*;
import java.io.*;

class ReplaceGreatest{
  public static void replaceGreatest(int arr[]){
    int n = arr.length;
    int max = arr[n-1];
    arr[n-1] = -1;

    for( int i = n-2; i >= 0; i--){

      if(arr[i] > max){
        int temp = arr[i];
        arr[i] = max;
        max = temp;
      }
      else{
        arr[i] = max;
      }
    }
  }

  public static void printArray(int arr[]){
    int n = arr.length;

    for( int i = 0; i < n; i++){
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }

  public static void main(String[] args){
    int arr[] = { 12, 17, 13, 6, 5, 2, 3};
    printArray(arr);
    replaceGreatest(arr);
    printArray(arr);
  }
}
