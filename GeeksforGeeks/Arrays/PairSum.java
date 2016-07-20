import java.util.*;
import java.io.*;

class PairSum{

  static void _pairsum(int arr[], int sum){
    HashSet<Integer> hs = new HashSet<Integer>();
    int len = arr.length;
    for(int i = 0; i < len; i++)
      hs.add(arr[i]);

    for(int i = 0; i < len; i++){
      int tmp = sum - arr[i];

      if(hs.contains(tmp))
        System.out.println("(" + arr[i] + "," + tmp + ")");
    }
  }

  public static void main(String[] args){
    int arr[] = {1, 4, 45, 6, 10, -8};
    int n = 16;
    _pairsum(arr, n);
  }
}
