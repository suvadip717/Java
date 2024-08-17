public class InsertionSort {
    public static void showArray(int[] arra) {
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 10, 5, 8, 2, 7, 9, };
        for(int i=1; i<array.length; i++){
            int current = array[i];
            int j = i-1;
            while (j>=0 && array[j]>current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1]=current;
        }
        showArray(array);
    }
}
