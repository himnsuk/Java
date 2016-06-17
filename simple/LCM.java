class LCM{
  int a;
  int b;

  LCM(int a, int b){
    this.a = a;
    this.b = b;
  }

  public int getLCM(int x, int y){
    int p = x;
    int q = y;

    while(p != q){
      if(p > q)
        p = p - q;
      else
        q = q - p;
    }

    return (x*y)/p;
  }

  public static void main(String[] args){

    LCM lcm = new LCM(5, 7);

    int z = lcm.getLCM(lcm.a, lcm.b);

    System.out.println(z);
  }
}
