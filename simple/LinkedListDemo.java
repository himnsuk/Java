import java.util.*;
class LinkdeListDemo{
  public static void main(String args[]){
    LinkedList<String> al = new LinkedList<String>();
    System.out.println("Size of al" + al.size());
    al.add("H");
    al.add("I");
    al.add("M");
    al.add("A");
    al.add("N");
    al.add("S");
    al.add("H");
    al.add("U");
    System.out.println("Size of al" + al.size());
    System.out.println("Print the array list" + al);
    al.removeFirst();
    al.removeLast();
    System.out.println("Print the array list" + al);
    String y = al.toString();
    System.out.println("Print convert to string value" + y);
  }
}
