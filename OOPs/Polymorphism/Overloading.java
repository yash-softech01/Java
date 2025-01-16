package OOPs.Polymorphism;

public class Overloading {
  
  public int sum(int x, int y) {
    return x + y;
  }

  public int sum(int x, int y, int z) {
    return x+y+z;
  }

  public static void main(String[] args) {
    Overloading overload = new Overloading();

    System.out.println(overload.sum(11, 9));
    System.out.println(overload.sum(2, 3, 5));
  }
}
