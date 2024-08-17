public class HollowRectangle {
    public static void main(String[] args) {
        int m = 8;
        int n = 10;
        // ******************************* First Approach ************************************
        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if(i==0 || i==(m-1) || j==0 || j==(n-1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // ******************************* Second Approach ************************************
        // for(int i=0; i<m; i++){
        //     if(i==0 || i==(m-1)){
        //         for(int j=0; j<n; j++){
        //             System.out.print("* ");
        //         }
        //     }
        //     else {
        //         for(int j=0; j<n; j++){
        //             if(j==0 || j==(n-1)){
        //                 System.out.print("* ");
        //             }
        //             else {
        //                 System.out.print("  ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
