
public class MergeSort {
    public static void merge(int[] array, int si, int mid, int en) {
        int[] merged = new int[en-si+1];
        
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1<=mid && en>=idx2){
            if(array[idx1]<array[idx2]){
                merged[x]=array[idx1];
                x++;
                idx1++;
            }
            else{
                merged[x]=array[idx2];
                x++;
                idx2++;
            }
        }

        while(idx1<=mid){
            merged[x]=array[idx1];
            x++;
            idx1++;
        }
        while (idx2<=en) {
            merged[x]=array[idx2];
            x++;
            idx2++;
        }

        for(int i=0, j=si; i< merged.length; i++,j++){
            array[j]=merged[i];
        }
    }

    public static void devide(int[] array, int si, int en) {
        int mid = si + (en - si) / 2;

        if (si >= en) {
            return;
        }
        // Devide array
        devide(array, si, mid);
        devide(array, mid + 1, en);

        // Merge array
        merge(array, si, mid, en);
    }

    public static void main(String[] args) {
        int[] array = { 2, 9, 1, 5, 8, 3, 6 };
        int n = array.length;
        devide(array, 0, n - 1);

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
