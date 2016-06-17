import java.util.*;
class HashDemo{
  public static void main(String[] args){
    Hashtable<Integer, Boolean> hm = new Hashtable<Integer, Boolean>();

    hm.put(100, true);
    hm.put(101, true);
    hm.put(102, true);
    hm.put(103, true);
    hm.put(104, true);
    hm.put(105, true);
    hm.put(106, true);

    System.out.println( hm.contains(false));
    System.out.println( hm.containsKey(107));
  }
}
