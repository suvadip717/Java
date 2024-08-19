
public class CheckSorted {
    public static void chckArray(int[] arr,int n){
        if(n==arr.length-1){
            System.out.println("true");
            return;
        }
        if(arr[n]<arr[n+1]){
            chckArray(arr,n+1);
        }
        else {
            System.out.println("false");
            return;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        chckArray(array,0);
    }
}
