// Array Reverse

// Input: arr[] = {1, 4, 3, 2, 6, 5}  
// Output: {5, 6, 2, 3, 4, 1}
// Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

// Input: arr[] = {4, 5, 1, 2} 
// Output: {2, 1, 5, 4}
// Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.


public class ReverseArray {
    public static void swapArray(int[] array){
        int n = array.length;
        for(int i=0; i<n/2; i++){
            int temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,7,9,1,6,10};
        swapArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

// Time Complexity: O(n)
// Auxiliary Space: O(1) 