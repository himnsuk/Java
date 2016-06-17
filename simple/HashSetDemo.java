import java.util.*;
class HashSetDemo{
  public static void main(String args[]){
    HashSet<String> al = new HashSet<String>();
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
    String y = al.toString();
    System.out.println("Print convert to string value" + y);
    // System.out.println(al.get());
  }
}
