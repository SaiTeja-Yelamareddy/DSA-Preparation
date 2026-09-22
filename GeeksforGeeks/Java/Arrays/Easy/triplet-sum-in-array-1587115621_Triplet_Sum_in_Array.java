/*
 * Platform: GeeksforGeeks
 * Problem ID: triplet-sum-in-array-1587115621
 * Problem: Triplet Sum in Array
 * Problem Link: https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.*;

class Solution {
    public boolean hasTripletSum(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == target) {
                    return true;
                }
                else if (sum < target) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return false;
    }
}