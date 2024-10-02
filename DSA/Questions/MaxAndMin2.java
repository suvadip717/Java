// Maximum and minimum of an array using minimum number of comparisons
// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1
// Maximum element is: 9

// Input: arr[] = {22, 14, 8, 17, 35, 3}
// Output:  Minimum element is: 3
// Maximum element is: 35

import java.util.Arrays;

class Pair{
    int min;
    int max;
}

public class MaxAndMin2 {
    public static Pair getMinMax(int arr[], int length){
        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.min = arr[0];
        minmax.max = arr[length-1];
        return minmax;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,7,8,1,3,22,11};
        Pair minMax = getMinMax(arr, arr.length);
        System.out.println("Minimum element is: "+minMax.min);
        System.out.println("Minimum element is: "+minMax.max);
    }
}

// Time complexity: O(n log n)
// Auxilary Space: is O(1)