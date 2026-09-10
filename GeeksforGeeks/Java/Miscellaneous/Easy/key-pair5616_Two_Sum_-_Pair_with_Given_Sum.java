/*
 * Platform: GeeksforGeeks
 * Problem ID: key-pair5616
 * Problem: Two Sum - Pair with Given Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/key-pair5616/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}