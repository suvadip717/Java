interface A {
  void show();
}

public class FunctionalInterface {
  public static void main(String args[]) {
    // A obj = new A() {
    // public void show() {
    // System.out.println("In show");
    // }
    // };
    A obj = () -> {
      System.out.println("In show"); // Labdha Function
    };
    obj.show();
  }
}
