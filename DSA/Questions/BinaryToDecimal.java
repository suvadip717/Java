import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = sc.nextInt();
        int deci = 0, a = 1;

        while (num>0) {
            int rem = num%10;
            deci = deci + rem*a;
            a = a*2;
            num = num/10;
        }
        System.out.println(deci);
    }
}
