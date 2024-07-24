abstract class A{
  public abstract void show();
  public abstract void config();
}
public class AnonymousAbstruct {
  public static void main(String args[]){
    A obj = new A() {
      public void show(){
        System.out.println("In a new show");
      }
      public void config(){
        System.out.println("In a config");
      }
    };

    obj.show();
    obj.config();
  }
}
