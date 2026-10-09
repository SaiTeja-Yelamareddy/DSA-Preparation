/*
 * Platform: GeeksforGeeks
 * Problem ID: max-sum-subarray-of-size-k5313
 * Problem: Max Sum Subarray of Size K
 * Problem Link: https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int l=0;
        int sum=0;
        for(int r=0;r<k;r++)
        {
            sum+=arr[r];
        }
        int max=sum;
        for(int r=k;r<arr.length;r++)
        {
            sum=sum-arr[r-k];
            sum+=arr[k];
            max=Math.max(sum,max);
        }
        return max;
        
    }
}