class StringConcept{
  void reverse(String str, int len){
    if(len == 0)
      return;
    else
      System.out.print(str.charAt(len - 1));
      reverse(str, (len - 1));
  }
  public static void main(String[] args){
    String str = "Himanshu";

    StringConcept SC = new StringConcept();

    int len = str.length();
    SC.reverse(str, len);
  }
}
