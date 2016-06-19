import java.util.*;
class UniqueChar{

  public boolean check(String str){
    boolean[] extra = new boolean[256];
    Arrays.fill(extra, false);
    for(int i = 0; i < str.length(); i++){
      if(extra[str.charAt(i)] == true)
        return false;
      else
        extra[str.charAt(i)] = true;
    }

    return true;
  }

  public static void main(String[] args){

    UniqueChar UC = new UniqueChar();
    Scanner user_input = new Scanner(System.in);
    String str = user_input.next();
    boolean test = UC.check(str);
    System.out.println(test);
  }
}



