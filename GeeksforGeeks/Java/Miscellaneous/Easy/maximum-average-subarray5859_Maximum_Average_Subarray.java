/*
 * Platform: GeeksforGeeks
 * Problem ID: maximum-average-subarray5859
 * Problem: Maximum Average Subarray
 * Problem Link: https://www.geeksforgeeks.org/problems/maximum-average-subarray5859/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int findMaxAverage(List<Integer> arr, int k) {
        // code here
        int l=0;
        double sum=0;
        for(int r=0;r<k;r++)
        {
            sum+=arr.get(r);
        }
        double max=sum;
        for(int r=k;r<arr.length;r++)
        {
            sum=sum-arr.get(r-k);
            sum+=arr.get(r);
            max=Math.max(sum,max);
        }
        return max/k;       
    }
}