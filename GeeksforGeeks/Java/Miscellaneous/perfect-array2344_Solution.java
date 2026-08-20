/*
 * Platform: GeeksforGeeks
 * Problem ID: perfect-array2344
 * Problem: Solution
 * Problem Link: https://www.geeksforgeeks.org/problems/perfect-array2344/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

class Solution {
    public boolean isPerfect(int[] arr) {
        // code here
        int i=0;
        int n=arr.length;
        while(i<n-1&&arr[i]<arr[i+1])
        {
            i++;
        }
        while(i<n-1&&arr[i]==arr[i+1])
        {
            i++;
        }
        while(i<n-1&&arr[i]>arr[i+1])
        {
            i++;
        }
        return i==n-1;
    }
}
