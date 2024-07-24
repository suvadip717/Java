enum Status{
  Running, Failed, Pendding, Success;
}

public class EnumStatus {
  public static void main(String args[]){
    Status s = Status.Failed;
    Status ss[] = Status.values();
    System.out.println(s);
    System.out.println(s.ordinal());

    for (Status p: ss) {
      System.out.println(p+" : "+p.ordinal());
    }
  }
}
