import java.util.*;
class ArrayListDemo{
  public static void main(String args[]){
    ArrayList<String> al = new ArrayList<String>();
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
    al.remove("H");
    al.remove(3);
    System.out.println("Print the array list" + al);
    System.out.println("Print convert to string value" + al.toString());
  }
}
