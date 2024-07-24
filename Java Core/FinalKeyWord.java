// class final calc{   // If we using final keyword with class we can't use the class as a parent class
class calc{
  // public void final show(){  // If we using final keyword with method we can't use the method in other class
  public void show(){
    System.out.println("I am a simple calculator");
  }
  public void add(int a, int b){
    System.out.println(a+b);
  }
}
class advCalc extends calc{
  public void show(){
    System.out.println("I am a Advance calculator");
  }
}
public class FinalKeyWord {
  public static void main(String args[]){
    final int num=8;
    // num=10;  //Can't overriding the veriable when using final keyword
    System.out.println(num);

    calc obj = new calc();
    obj.show();
    obj.add(5, 8);

    advCalc obj1 = new advCalc();
    obj1.show();
  }
}
