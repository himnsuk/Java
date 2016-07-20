import java.util.*;
import java.io.*;

class MajorOdd{

  static int _oddoccurrence(int arr[], int len){
    int res = 0;

    for(int i = 0; i < len; i++){
      res = res ^ arr[i];
    }
    return res;
  }

  public static void main(String[] args){

    int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 4, 2, 4, 4, 2};
    int n = arr.length;
    System.out.println(_oddoccurrence(arr, n));
  }
}
