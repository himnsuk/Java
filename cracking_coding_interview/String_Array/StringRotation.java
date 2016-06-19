import java.util.*;
class StringRotation{
  static boolean areRotation(String str1, String str2){
    return ((str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1));
  }
  public static void main(String[] args){
    Scanner user_input = new Scanner(System.in);
    String str1 = user_input.next();
    String str2 = user_input.next();
    System.out.println(areRotation(str1, str2));
  }
}
