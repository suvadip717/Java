// Maximum and minimum of an array using minimum number of comparisons
// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1
// Maximum element is: 9

// Input: arr[] = {22, 14, 8, 17, 35, 3}
// Output:  Minimum element is: 3
// Maximum element is: 35



public class MaxAndMin {
    public static int maxSet(int array[], int length){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<length; i++)
        {
            if (max<array[i]) {
                max=array[i];
            }
        }
        return max;
    }
    public static int minSet(int array[], int length){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<length; i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {3,6,9,1,2,45,23};
        System.out.println("Maximum element is: "+ maxSet(arr, arr.length));
        System.out.println("Minimum element is: "+ minSet(arr, arr.length));
    }
}

// Time Complexity: O(N)
// Auxiliary Space: O(1)