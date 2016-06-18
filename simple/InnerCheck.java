class Outer_Demo{
  int num;

  private class Inner_Demo{
    public void print(){
      System.out.println("This is an inner Class");
    }
  }

  void display_inner(){
    Inner_Demo inner = new Inner_Demo();
    inner.print();
  }
}

class InnerCheck{
  public static void main(String[] args){
    Outer_Demo out = new Outer_Demo();
    out.display_inner();
  }
}
