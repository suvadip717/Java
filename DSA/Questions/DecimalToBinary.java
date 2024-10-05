import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int a=1, binary=0;
        while (num>0) {
            int rem = num%2;
            binary = binary + a*rem;
            a = a*10;
            num = num/2;
        }
        System.out.println(binary);
    }
}
