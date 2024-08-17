public class SelectionSort {
    public static void showArray(int[] arra) {
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 10, 5, 8, 2, 7, 9, };
        
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        showArray(array);
    }
}
