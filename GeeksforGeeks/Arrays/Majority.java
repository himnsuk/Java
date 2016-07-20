import java.util.*;
import java.io.*;

class Majority{

  static int _majority(int arr[]){
    int majority_index = 0;
    int len = arr.length;
    int count = 1;
    for(int i = 1; i < len; i++){
      if(arr[majority_index] == arr[i])
        count++;
      else
        count --;
      if(count == 0){
        majority_index = i;
        count = 1;
      }
    }
    return arr[majority_index];
  }

  public static void main(String[] args){
    int arr[] = {1,3, 3, 4, 5,6,5,7,5};
    System.out.println(_majority(arr));
  }
}
