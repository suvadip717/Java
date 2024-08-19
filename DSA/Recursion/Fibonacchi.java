import java.util.Scanner;

public class Fibonacchi {
     public static void printFibonacci(int first,int second,int n){
        System.out.print(first+" ");
        if(n==0){
            return;
        }
        int sum=first+second;
        first = second;
        second = sum;
        n--;
        printFibonacci(first,second,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printFibonacci(0,1,n);
        System.out.println();
    }
}
