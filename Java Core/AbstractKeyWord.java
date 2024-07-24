abstract class car{
  public abstract void drive();
  public abstract void fly();

  public void playMusic(){
    System.out.println("Play music...");
  }
}
abstract class WagonR extends car{
  public void drive(){
    System.out.println("Driving car....");
  }
}
class updatedWagonR extends WagonR{ //concreate class
  public void fly(){
    System.out.println("Flying....");
  }
}
public class AbstractKeyWord {
  public static void main(String args[]){
    car obj = new updatedWagonR();
    obj.playMusic();
    obj.drive();
    obj.fly();
  }
}
