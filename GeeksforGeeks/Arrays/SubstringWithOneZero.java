import java.util.*;
import java.io.*;
import java.lang.*;

public class SubstringWithOneZero{
  public static int substringCount(char arr[]){
    int n = arr.length;
    int count = 0;
    for(int i = 0; i < n; i++){
      if(arr[i] == '1'){
        count++;
      }
    }
    return (count*(count - 1))/2;
  }

  public static void main(String[] args) 
  {
    String string = "00100101";
    char str[] = string.toCharArray();
    int n = str.length;
    System.out.println(substringCount(str));
  }
}
