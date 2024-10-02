// Maximum Subarray Sum – Kadane’s Algorithm

// Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
// Output: 11
// Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

// Input: arr[] = {-2, -4}
// Output: –2
// Explanation: The subarray {-2} has the largest sum -2.

// Input: arr[] = {5, 4, 1, 7, 8}
// Output: 25
// Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.

public class MaximumSubArray {
    public static int subarray(int arr[]){
        int res = arr[0];
        int maxEnding = arr[0];

        for(int i=1; i<arr.length; i++){
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(subarray(arr));
    }
}

// Time Complexity: O(n)
// Auxiliary Space: O(1)
