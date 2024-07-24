// Check number even or odd

public class ternary_operator {

    public static void main(String[] args) {
        int a = 20;

        // if (a % 2 == 0) {
        //     System.out.println("Number is even");
        // } else {
        //     System.out.println("Number is odd");
        // }
        String result = a % 2 == 0 ? "Number is even" : "Number is odd";
        System.out.println(result);
    }
}
