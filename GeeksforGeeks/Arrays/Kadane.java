import java.util.*;
import java.io.*;

class Kadane{
  public static int kadane(int arr[]){
    int n = arr.length;
    int max_so_for = 0, max_ending_here = 0;

    for( int i = 0; i < n; i++){
      max_ending_here += arr[i];
      if(max_ending_here < 0){
        max_ending_here = 0;
      }

      if(max_so_for < max_ending_here){
        max_so_for = max_ending_here;
      }
    }
    return max_so_for;
  }

  public static void printArray(int arr[]){
    int n = arr.length;

    for(int i =0; i < n; i++){
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }

  public static void main(String[] args){
    int[] arr = {6, -3, -10, 0, 2};
    printArray(arr);
    System.out.println(kadane(arr));
  }
}
