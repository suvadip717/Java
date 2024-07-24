
public class while_loop {

    public static void main(String[] args) {
        int n = 10;

        while (n != 0) {
            System.err.println("The value of n is " + n);
            int i = 2;
            while (i != 0) {
                System.err.println("Hello");
                i--;
            }
            n--;
        }
    }
}
