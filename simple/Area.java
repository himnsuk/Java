class Area{

  Rectangle r2;

  class Rectangle{
    double length;
    double width;
  }

  public void area(){
    Rectangle r1 = new Rectangle();
    r1.length = 10;
    r1.width = 20;

    System.out.println("Area = " + r1.length * r1.width);
  }

  public void showData(){
    System.out.println(r2);
  }


  public static void main(String[] args){
    Area demo = new Area();
    // demo.area();
    demo.showData();
  }
}

