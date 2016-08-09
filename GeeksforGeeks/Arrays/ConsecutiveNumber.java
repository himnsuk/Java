import java.util.*;
import java.io.*;

class ConsecutiveNumber{
  static boolean consecutive_number(int arr[]){
    int n = arr.length;
    int max = arr[0], min = arr[0];

    for(int i = 1; i < n; i++){
      if(min > arr[i])
        min = arr[i];
      if(max < arr[i])
        max = arr[i];
    }

    if((max - min + 1) == n)
      return true;
    return false;
  }

  public static void main(String[] args){
    int arr[] = {24, 25, 26, 27};
    System.out.println(consecutive_number(arr));
  }
}
