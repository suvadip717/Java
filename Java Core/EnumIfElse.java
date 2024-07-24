enum Status{
  Running, Failed, Pendding, Success;
}
public class EnumIfElse {
  public static void main(String args[]){
    Status s = Status.Pendding;

    if(s==Status.Running){
      System.out.println("Everything is good");
    }
    else if (s==Status.Failed) {
      System.out.println("Please try again");
    }
    else if(s==Status.Pendding){
      System.out.println("Please wait for sometime");
    }
    else{
      System.out.println("Done");
    }
  }
}
