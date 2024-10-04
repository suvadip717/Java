import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean answer = true;

        if(num>2){
            for(int i=2; i<num; i++){
                if(num%i==0){
                    answer = false;
                }
            }
        }
        System.out.println(answer);
    }
}
