import java.util.*;

class StackDemo{
  static void showPush(Stack st, int i){
    st.push(i);
    System.out.println("Push(" + i + ")");
    System.out.println("Stack" + st);
  }

  public static void main(String[] args){
    Stack st = new Stack();
    showPush(st, 5);
    showPush(st, 6);
    showPush(st, 7);
    Iterator<Integer> iter = st.iterator();
    
    while(iter.hasNext()){
      System.out.println(iter.next());
    }
    
    System.out.println("--------------");
    System.out.println(st.size());
    System.out.println("--------------");
    // System.out.println(st.pop());
    // System.out.println("--------------");
    // System.out.println(st.pop());
    // System.out.println("--------------");
    // System.out.println(st.pop());
    // System.out.println("--------------");
    // System.out.println(st.isEmpty());

    while(!st.isEmpty()){
      System.out.println(st.pop());
    }
  }
}

