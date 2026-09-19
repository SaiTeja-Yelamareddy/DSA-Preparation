/*
 * Platform: GeeksforGeeks
 * Problem ID: pair-sum-in-a-sorted-and-rotated-array
 * Problem: Pair Sum in a Sorted and Rotated Array
 * Problem Link: https://www.geeksforgeeks.org/problems/pair-sum-in-a-sorted-and-rotated-array/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean pairInSortedRotated(int[] arr, int target) {

        int n = arr.length;
        int pivot = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i + 1;
                break;
            }
        }
        int low = pivot;
        int high = (pivot - 1 + n) % n;

        while (low != high) {

            int sum = arr[low] + arr[high];

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                low = (low + 1) % n;
            } else {
                high = (high - 1 + n) % n;
            }
        }

        return false;
    }
}