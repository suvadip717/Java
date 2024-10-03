// Chocolate Distribution Problem

// Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
// Output: Minimum Difference is 2 
// Explanation:
// We have seven packets of chocolates and we need to pick three packets for 3 students 
// If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

// Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
// Output: Minimum Difference is 6 

// Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50} , m = 7 
// Output: Minimum Difference is 10 

import java.util.Arrays;

public class ChocolateDistribution {
    public static int chocolateDistribution(int arr[], int m){
        if(arr.length == 0 || m == 0 ){
            return 0;
        }

        Arrays.sort(arr);

        if(arr.length-1 < m){
            return -1;
        }

        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int nextStep = i+m-1;
            
            if(nextStep >= arr.length){
                break;
            }
            
            int diff = arr[nextStep]-arr[i];

            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
    
    public static void main(String[] args) {
       int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
       int m = 7;
       int result=chocolateDistribution(arr,m);
       
       if(result<0){
        System.out.println("Invalid Input");
       }
       else{
        System.out.println("Minimum difference is: "+result);
       }
    }
}

// Time Complexity: O(N*log(N))
// Auxiliary Space: O(1)