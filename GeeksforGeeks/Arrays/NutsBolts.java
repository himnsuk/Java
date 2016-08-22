import java.util.*;
import java.io.*;
import java.lang.*;

public class NutsBolts{
  public static void matchPair(char[] nuts, char[] bolts, int left, int right){
    if(left < right){
      int pivot = partition(nuts, left, right, bolts[right]);
      partition(bolts, left, right, nuts[pivot]);
      matchPair(nuts, bolts, left, pivot - 1);
      matchPair(nuts, bolts, pivot + 1, right);
    }
  }

  public static int partition(char[] arr, int low, int high, int pivot){
    int i = low - 1;
    for(int j = low; j < high; j++)
    {
      if(arr[j] < pivot){
        i++;
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    char temp2 = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp2;
    return i+1;
  }
    //Driver method
    public static void main(String[] args)
    {
        // Nuts and bolts are represented as array of characters
        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};
 
        System.out.println("Before Match");
        printArray(nuts);
        printArray(bolts);
        // Method based on quick sort which matches nuts and bolts
        matchPair(nuts, bolts, 0, 5);
 
        System.out.println("Matched nuts and bolts are : ");
        printArray(nuts);
        printArray(bolts);
    }
 
    // Method to print the array
    private static void printArray(char[] arr) {
        for (char ch : arr){
            System.out.print(ch + " ");
        }
        System.out.print("\n");
    }
}
