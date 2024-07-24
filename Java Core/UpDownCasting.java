class A{
  public void show(){
    System.out.println("In A show");
  }
}
class B extends A{
  public void show1(){
    System.out.println("In B show");
  }
}

public class UpDownCasting {
  public static void main(String args[]){
    A obj = new B();
    obj.show();

    B obj1 = (B)obj;
    obj1.show1();
  }
}
