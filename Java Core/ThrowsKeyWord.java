// class A {
//   public void show() {
//     try {
//       Class.forName("Hello");
//       System.out.println("Found the class");
//     } catch (ClassNotFoundException e) {
//       System.out.println("Not able to found the class " + e);
//     }
//   }
// }
class A {
  public void show() throws ClassNotFoundException {
    Class.forName("Calc");
  }
}

public class ThrowsKeyWord {
  static {
    System.out.println("Class loaded");
  }

  public static void main(String args[]) {
    A obj = new A();
    try {
      obj.show();
    } catch (ClassNotFoundException e) {
      // e.printStackTrace();
      System.out.println(e);
    }
  }
}
