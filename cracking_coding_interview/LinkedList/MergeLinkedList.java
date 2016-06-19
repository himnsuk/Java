class Node{
  int data;
  Node next;

  Node(int d){
    data = d;
    next = null;
  }
}

class MergeLinkedList{
  static Node a;
  static Node b;

  public static Node mergeLinkedList(Node a, Node b){
    if(a == null){ return b;};
    if(b == null){ return a;};

    if(a.data < b.data){
      a.next = mergeLinkedList(a.next, b);
      return a;
    }else{
      b.next = mergeLinkedList(b.next, a);
      return b;
    }
  }

  public static void pusha(int d){
    Node new_node = new Node(d);
    new_node.next = a;
    a = new_node;
  }

  public static void pushb(int d){
    Node new_node = new Node(d);
    new_node.next = b;
    b = new_node;
  }
  public static void print(Node head){
    Node n = head;
    while(n != null){
      System.out.print(n.data + "->");
      n = n.next;
    }
  }

  public static void main(String[] args){
    int i = 9;
    while(i > 0){
      pusha(i);
      i -= 2;
    }

    i = 10;
    while(i > 1){
      pushb(i);
      i -= 2;
    }
    print(a);
    System.out.println();
    print(b);

    Node c = mergeLinkedList(a, b);
    System.out.println();
    print(c);
  }
}
