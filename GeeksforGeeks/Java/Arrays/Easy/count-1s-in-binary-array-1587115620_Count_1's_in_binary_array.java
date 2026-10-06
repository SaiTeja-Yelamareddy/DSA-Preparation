/*
 * Platform: GeeksforGeeks
 * Problem ID: count-1s-in-binary-array-1587115620
 * Problem: Count 1's in binary array
 * Problem Link: https://www.geeksforgeeks.org/problems/count-1s-in-binary-array-1587115620/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
     public static int lastSearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == k) {
                ans = mid;
                l = mid + 1;
            }
            
            else {
                r = mid - 1;
            }
        }
        return ans;
    }
    public int countOnes(int[] arr) {
        // code here
        int last=lastSearch(arr,1);
        if(last==-1)
        return 0;
        return last+1;
    }
}
