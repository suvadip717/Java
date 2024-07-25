import java.lang.FunctionalInterface;

@FunctionalInterface
interface A {
  int show(int i, int j);
}

public class DepthLambda {
  public static void main(String args[]) {
    A obj = (i, j) -> i + j;

    int result = obj.show(5, 4);
    System.out.println(result);
  }
}
