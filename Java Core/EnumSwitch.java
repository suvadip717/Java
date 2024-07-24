enum Status{
  Running, Failed, Pendding, Success;
}
public class EnumSwitch {
  public static void main(String args[]){
    Status s = Status.Pendding;

    switch (s) {
      case Running:
        System.out.println("Everything is good");
        break;
      case Failed:
        System.out.println("Please try again");
        break;
      case Pendding:
        System.out.println("Please wait some time");
        break;
      case Success:
        System.out.println("Done");
        break;
    
      default:
        System.out.println("Please choose currect");
        break;
    }
  }
}
