class A {
  public void show() {
    System.out.println("In A show");
  }
}

class B extends A {

  @Override
  public void show() {
    System.out.println("In B show");
  }
}

public class MetaData {
  public static void main(String args[]) {
    B obj = new B();
    obj.show();
  }
}
