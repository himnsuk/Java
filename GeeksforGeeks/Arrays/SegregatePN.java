import java.util.*;
import java.io.*;

public class SegregatePN{
  static int[] read_numbers(){
    Scanner s = new Scanner(System.in);
    int count = s.nextInt();
    s.nextLine();

    int[] numbers = new int[count];

    Scanner numberScanner = new Scanner(s.nextLine());

    for(int i = 0; i < count; i++){
      if(numberScanner.hasNext()){
        numbers[i] = numberScanner.nextInt();
      }else{
        System.out.println("You didn't Provide enough numbers");
        break;
      }
    }
    return numbers;
  }

  public static void main(String[] args){
    int[] numb = read_numbers();
    System.out.println(Arrays.toString(numb));
  }
}


