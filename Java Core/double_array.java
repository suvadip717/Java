
// import java.util.Random;
public class double_array {

    public static void main(String[] args) {
        int arra[][] = new int[3][];
        // Random rand = new Random();
        arra[0] = new int[3];
        arra[1] = new int[4];
        arra[2] = new int[5];

        for (int i = 0; i < 3; i++) {             //Jugged Array
            for (int j = 0; j < arra[i].length; j++) {
                arra[i][j] = (int) (Math.random() * 10);
            }
        }

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.err.print(arra[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        System.out.println("");
        // Print Array in different way
        for (int n[] : arra) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
