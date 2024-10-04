import java.util.Scanner;

public class Fibonachi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int st = 0;
        int temp = 1;
        System.out.print(st+" ");
        for(int i=0; i<num; i++){
            int sum = st+temp;
            System.out.print(sum + " ");
            st = temp;
            temp = sum;
        }
        System.out.println();
    }
}