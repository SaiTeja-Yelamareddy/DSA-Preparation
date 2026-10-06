/*
 * Platform: GeeksforGeeks
 * Problem ID: index-of-first-1-in-a-sorted-array-of-0s-and-1s4048
 * Problem: First 1 in a Sorted Binary Array
 * Problem Link: https://www.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s4048/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int firstIndex(int arr[]) {
        // code here
    }
}
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
    public int firstIndex(int[] arr) {
        // code here
        int last=lastSearch(arr,0);
        if(last==-1)
        return 0;
        return last+1;
    }
}
