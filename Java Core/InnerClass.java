class A{
  int age;
  public void show(){
    System.out.println("In show...");
  }
  // class B{
  static class B{
    public void config(){
      System.out.println("In config...");
    }
  }
}
public class InnerClass {
  public static void main(String args[]){
    A obj = new A();
    obj.show();

    // A.B obj1 = obj.new B();
    A.B obj1 = new A.B();
    obj1.config();
  }
}
