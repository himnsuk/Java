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
  
  public int gcd(int a, int b){
    if(b == 0)
      return a;
    else
      return gcd(b, a%b);
  }

  public static void main(String[] args){
    LCM lcm = new LCM(16, 4);
    int z = lcm.getLCM(lcm.a, lcm.b);
    System.out.println(z);
    int y = lcm.gcd(lcm.a, lcm.b);
    System.out.println(y);
  }
}
