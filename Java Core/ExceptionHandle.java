public class ExceptionHandle {
  public static void main(String args[]) {
    // int i = 5;
    int i = 2;
    int j = 0;
    int num[] = new int[5];
    String name = null;

    try {
      j = 23 / i;
      System.out.println(name.length());
      System.out.println(num[1]);
      System.out.println(num[5]);
    } catch (ArithmeticException e) {
      System.out.println("Number can't devided by Zero");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Keep in bundaries limit");
    } catch (Exception e) {
      System.out.println("Something went wrong..." + e);
    }
    System.out.println(j);
    System.out.println("Bye");
  }
}
