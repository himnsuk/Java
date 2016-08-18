import java.util.*;
import java.io.*;
import java.lang.*;

class FormBiggestNumber{
  public static void main(String[] args) throws java.lang.Exception
  {
    int[] arr = { 54, 546, 548, 60};
    String[] arrString = new String[arr.length];
    String s = "";
    for(int i = 0; i < arr.length; i++){
      s += String.valueOf(arr[i]);
    }
    System.out.println(s);
  }
}
