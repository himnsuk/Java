class Node{
  int data;
  Node next;

  Node(int d){
    data = d;
    next = null;
  }
}

class IntroLinkedLIst{

  public static void main(String[] args){
    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node head;

    head = first;
    first.next = second;
    second.next = third;
    Node n = head;
    while(n != null){
      System.out.println(n.data);
      n = n.next;
    }
  }
}
