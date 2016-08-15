import java.util.*;
import java.io.*;

class RepeatingNumbers{

  static void repeating_element(int arr[]){
    int n = arr.length;

    for(int i = 0; i < n; i++){
      if(arr[Math.abs(arr[i])] > 0){
        arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
        System.out.println("Putting index for numbers");
        System.out.println(Math.abs(arr[i]));
      }
      else{
        System.out.println("Actually Repeating Numbers");
        System.out.println(Math.abs(arr[i]));
      }
    }
  }

  public static void main(String[] args){
    int[] arr = { 1, 2, 3, 3, 2, 4};
    repeating_element(arr);
  }
}
