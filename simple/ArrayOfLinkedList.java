import java.util.*;
import java.io.*;

class ArrayOfLinkedList{
  public static void main(String[] args){
    @SuppressWarnings("unchecked") LinkedList<Integer> adj[] = new LinkedList[5];
    for(int i = 0; i < 5; ++i){
      adj[i] = new LinkedList();
    }

    adj[0].add(20);
    ListIterator<Integer> listIterate = adj[0].listIterator();
    while(listIterate.hasNext()){
      System.out.println(listIterate.next());
    }
  }
}
