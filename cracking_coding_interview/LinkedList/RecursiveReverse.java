class Node{
  int data;
  Node next;

  Node(int d){
    data = d;
    next = null;
  }
}

class RecursiveReverse{
  static Node head;
  public static Node recursiveReverse(Node node){
    if(node == null || node.next == null)
      return node;
    Node rest = recursiveReverse(node.next);
    node.next.next = node;
    node.next = null;
    return rest;
  }

  public static void push(int d){
    Node new_node = new Node(d);
    new_node.next = head;
    head = new_node;
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
      push(i);
      i--;
    }
    print(head);
    System.out.println();
    Node n = recursiveReverse(head);
    print(n);
  }
}
