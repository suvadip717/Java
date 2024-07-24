
public class For_each {

    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 3;
        arr[1] = 10;
        arr[2] = 4;
        arr[3] = 7;

        for (int n : arr) {
            System.err.println(n);
        }
    }
}
