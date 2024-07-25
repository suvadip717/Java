public class ThorowKeyWord {
  public static void main(String args[]) {
    int i = 30;
    int j = 0;

    try {
      j = 24 / i;
      if (j == 0) {
        throw new ArithmeticException("I don't want to print zero");
      }
    } catch (ArithmeticException e) {
      j = 24 / 1;
      System.out.println("That is default output " + e);
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println(j);
    System.out.println("Bye");
  }
}
