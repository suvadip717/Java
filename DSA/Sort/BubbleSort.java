
public class BubbleSort {
    public static void showArray(int[] arra) {
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 10, 5, 8, 2, 7, 9, };
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        showArray(array);
    }
}
