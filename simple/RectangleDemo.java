class RectangleDemo{
  class Rectangle{
    double length;
    double width;
  }
  public static void main(String[] args){
    RectangleDemo Demo = new RectangleDemo();
    RectangleDemo.Rectangle r1 = Demo.new Rectangle();
    Rectangle r2 = r1;
    Rectangle r3 = null;
    r1.length = 10;
    r2.length = 20;
    System.out.println("Value of R1's length " + r1.length);
    System.out.println("Value of R2's length " + r2.length);
    try{
    System.out.println("Value of R2's length " + r3.length);
    }catch(Exception e){
      System.out.println(e);
    }

    if(r3 == null){
      System.out.println("Thie null conditions are working fine");
    }
  }
}

