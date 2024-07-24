interface Computer{
// abstract class Computer{
  //public abstract void code();
  void code();
}

class Desktop implements Computer{
// class Desktop extends Computer{
  public void code(){
    System.out.println("Code, compile, run, faster");
  }
}
class Laptop implements Computer{
// class Laptop extends Computer{
  public void code(){
    System.out.println("Code, compile, run");
  }
}

class Developer{
  public void devApp(Computer lap){
    lap.code();
  }
}

public class Interfaces {
  public static void main(String args[]){
    Laptop lap = new Laptop();
    Desktop desk = new Desktop();
    Developer navin = new Developer();
    navin.devApp(lap);
  }
}
