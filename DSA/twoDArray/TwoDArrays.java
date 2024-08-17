import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int a = sc.nextInt();
        System.out.print("Enter column size: ");
        int b = sc.nextInt();
        int[][] array = new int[a][b];
        for (int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print("Enter number for arr["+i+","+j+"] :");
                array[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
