
public class SumNumbers {
    public static void sumNum(int i,int n, int sum){
        sum+=i;
        if(i==n){
            System.out.println(sum);
            return;
        }
        i++;
        sumNum(i,n,sum);
   }
    public static void main(String[] args) {
        int sum=0;
        sumNum(1,5,sum);
    }
}
