class Node{
  int data;
  Node next;

  Node(int d){
    data = d;
    next = null;
  }
}

class ReverseLinkedList{
  static Node head;

  public static Node reverse(Node node){
    Node c = node;
    Node n = null;
    Node p = null;

    while(c != null){
      n = c.next;
      c.next = p;
      p = c;
      c = n;
    }

    node = p;

    return node;
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
    System.out.println("-----------");
    print(reverse(head));
  }
}
