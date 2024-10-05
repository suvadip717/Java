import java.util.Scanner;

public class NegativeToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String binaryNumber = Integer.toBinaryString(num);
        System.out.println(binaryNumber);
    }
}
