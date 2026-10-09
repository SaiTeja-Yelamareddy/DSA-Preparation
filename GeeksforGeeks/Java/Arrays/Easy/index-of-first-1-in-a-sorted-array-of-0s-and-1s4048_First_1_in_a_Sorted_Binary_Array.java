/*
 * Platform: GeeksforGeeks
 * Problem ID: index-of-first-1-in-a-sorted-array-of-0s-and-1s4048
 * Problem: First 1 in a Sorted Binary Array
 * Problem Link: https://www.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s4048/1
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

class Solution {
    public int firstIndex(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == 1) {
                ans = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return ans;
    }
}