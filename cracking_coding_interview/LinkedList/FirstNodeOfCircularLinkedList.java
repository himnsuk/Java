class Node{
  int data;
  Node next;

  Node(int d){
    data = d;
    next = null;
  }
}

class FirstNodeOfCircularLinkedList{
  static Node a;


  public static Node circularNode(Node a){  
    Node n1 = a;
    Node n2 = a;

    while(n2.next != null){
      n1 = n1.next;
      n2 = n2.next.next;
      if(n1 == n2)
        break;
    }

    if(n2 == null){
      return null;
    }

    n1 = a;
    while(n1 != n2){
      n1 = n1.next;
      n2 = n2.next;
    }

    return n2;
  }
  public static void pusha(int d){
    Node new_node = new Node(d);
    new_node.next = a;
    a = new_node;
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

    Node temp = a.next.next.next;

    Node n = a;
    while(n.next !=null){
      n = n.next;
    }
    n.next = temp;

    Node circularStart = circularNode(a);
    System.out.println(circularStart.data);
    System.out.println();
  }
}
