/*
 * Platform: GeeksforGeeks
 * Problem ID: count-the-zeros2550
 * Problem: Count Zeros in Sorted
 * Problem Link: https://www.geeksforgeeks.org/problems/count-the-zeros2550/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int countZeroes(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int firstZero = arr.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == 0) {
                firstZero = mid;
                r = mid - 1;     
            }
            else {
                l = mid + 1;       
            }
        }
        return arr.length - firstZero;
    }
}