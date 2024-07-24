
public class greaterNumber {

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 14;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
