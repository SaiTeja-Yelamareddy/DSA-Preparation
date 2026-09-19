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

import java.util.*;

class Solution {
    public boolean pairInSortedRotated(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}