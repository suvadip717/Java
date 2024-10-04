import java.util.Scanner;

public class CheckType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char data = sc.next().charAt(0);

        if(Character.isUpperCase(data)){
            System.out.println("Upper case latter");
        }
        else if(Character.isLowerCase(data)){
            System.out.println("Lower case latter");
        }
        else if (Character.isDigit(data)) {
            System.out.println("Number");
        }
        sc.close();
    }
}
