import java.util.*;

class QueueUsingStack{
  static Stack St1, St2;

  static void pushShow(int i){
    St1.push(i);
    System.out.println("Push(" + i +")");
    System.out.println(St1);
  }


  static void popShow(){

    if(St2.isEmpty()){
      while(!St1.isEmpty()){
        St2.push(St1.pop());
      }
    }
    System.out.println(St2.pop());
  }

  public static void main(String[] args){
    
    pushShow(3);
    pushShow(4);
    pushShow(5);
    popShow();
  }
}
