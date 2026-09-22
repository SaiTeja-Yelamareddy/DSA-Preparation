/*
 * Platform: GeeksforGeeks
 * Problem ID: find-triplets-with-zero-sum
 * Problem: Check for Triplet With 0 Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean findTriplet(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0) {
                    return true;
                }
                else if (sum < 0) {
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