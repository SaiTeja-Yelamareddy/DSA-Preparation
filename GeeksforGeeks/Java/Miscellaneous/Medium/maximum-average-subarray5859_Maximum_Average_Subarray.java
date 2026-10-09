/*
 * Platform: GeeksforGeeks
 * Problem ID: maximum-average-subarray5859
 * Problem: Maximum Average Subarray
 * Problem Link: https://www.geeksforgeeks.org/problems/maximum-average-subarray5859/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */


class Solution {
    public int findMaxAverage(List<Integer> arr, int k) {
        int sum = 0;
        for (int r = 0; r < k; r++) {
            sum += arr.get(r);
        }
        int maxSum = sum;
        int start = 0;
        for (int r = k; r < arr.size(); r++) {
            sum = sum - arr.get(r - k) + arr.get(r);
            if (sum > maxSum) {
                maxSum = sum;
                start = r - k + 1;
            }
        }

        return start;
    }
}
