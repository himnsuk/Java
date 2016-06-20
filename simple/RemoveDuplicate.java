import java.util.*;
class RemoveDuplicate{
  public static String removeDuplicate(String str){
    boolean[] extra = new boolean[256];
    StringBuilder str2 = new StringBuilder(str.length());
    for(int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      if(!extra[ch]){
        extra[ch] = true;
        str2.append(ch);
      }
    }
    return str2.toString();
  }

  public static void main(String[] args){
    Scanner user_input = new Scanner(System.in);
    String str = user_input.next();
    String test = removeDuplicate(str);
    System.out.println(test);
  }
}
