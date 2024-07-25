import java.lang.FunctionalInterface;

@FunctionalInterface
interface A {
  void show(int i, int j);
}

public class LambdhaExpression {
  public static void main(String args[]) {
    A obj = (int i, int j) -> {
      System.out.println("In Show :" + (i + j));
    };
    obj.show(5, 8);
  }
}
