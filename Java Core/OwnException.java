class NavinException extends Exception {
  public NavinException(String string) {
    super(string);
  }
}

public class OwnException {
  public static void main(String args[]) {
    int i = 30;
    int j = 0;

    try {
      j = 20 / i;
      if (j == 0) {
        throw new NavinException("I don't want to print zero");
      }
    } catch (NavinException e) {
      j = 20 / 1;
      System.out.println("That is default value " + e);
    } catch (Exception e) {
      System.out.println("Something went wrong... " + e);
    }
    System.out.println(j);
    System.out.println("Bye");
  }
}
