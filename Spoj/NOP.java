import java.util.*;
import java.lang.*;
import java.lang.*;

class NOP
{

  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner sc = new Scanner(System.in);
    String str = new String();

    int i = sc.nextInt();

    while(i > 0){
      str = sc.next();
      Stack stk = new Stack();
      String nop = new String();
      char ch;
      int n = str.length();
      for(int j = 0; j < n; j++){
        ch = str.charAt(j);
        switch(ch){
          case '(': break;
          case '+': stk.push(ch);
                    break;
          case '-': stk.push(ch);
                    break;
          case '*': stk.push(ch);
                    break;
          case '/': stk.push(ch);
                    break;
          case '^': stk.push(ch);
              break;
          case ')': nop = nop + stk.pop();
                    break;
          default: nop = nop + ch;
                   break;
        }

      }
      System.out.println(nop);
      i--;

    }
  }
}
