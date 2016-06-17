import java.util.*;
class HashTableDemo{
  public static void main(String args[]){
    Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

    ht.put(1, "Himanshu");
    ht.put(2, "Rohan");
    ht.put(3, "Maheshwar Rao");
    ht.put(4, "Vivek");
    ht.put(2, "Aditya");
    System.out.println(ht.values());
    System.out.println(ht.get(2));
  }
}
