
class Calculator {

    int result;

    public int add(int x, int y) {
        result = x + y;
        return result;
    }
}

public class Java_OOPs {

    public static void main(String arg[]) {
        int a = 8, b = 10;
        Calculator calc = new Calculator();
        int ans = calc.add(a, b);
        System.err.println(ans);
    }
}
