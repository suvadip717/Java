
public class FloydsTriangle {
    public static void main(String[] args) {
        int n=5, count=1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
