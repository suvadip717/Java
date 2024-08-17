import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int a = sc.nextInt();
        System.out.print("Enter column size: ");
        int b = sc.nextInt();
        int [][] array = new int[a][b];
        for (int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is: ");
        for (int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter a number you want to search: ");
        int num = sc.nextInt();
        for (int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(array[i][j]==num){
                    System.out.println("The index of array is: array["+i+","+j+"]");
                }
            }
        }
    }
}
