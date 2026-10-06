/*
 * Platform: GeeksforGeeks
 * Problem ID: floor-in-a-sorted-array-1587115620
 * Problem: Floor in Sorted Array
 * Problem Link: https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public static int findFloor(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= x) {
                ans = mid;
                l = mid + 1;     
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }
}