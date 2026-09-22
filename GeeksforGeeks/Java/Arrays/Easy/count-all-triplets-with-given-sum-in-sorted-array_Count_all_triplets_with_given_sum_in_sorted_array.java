/*
 * Platform: GeeksforGeeks
 * Problem ID: count-all-triplets-with-given-sum-in-sorted-array
 * Problem: Count all triplets with given sum in sorted array
 * Problem Link: https://www.geeksforgeeks.org/problems/count-all-triplets-with-given-sum-in-sorted-array/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == target) {
                    if (arr[l] == arr[r]) {
                        int total = r - l + 1;
                        count += total * (total - 1) / 2;
                        break;
                    }
                    int leftCount = 1;
                    int rightCount = 1;
                    while (l + 1 < r && arr[l] == arr[l + 1]) {
                        leftCount++;
                        l++;
                    }
                    while (r - 1 > l && arr[r] == arr[r - 1]) {
                        rightCount++;
                        r--;
                    }
                    count += leftCount * rightCount;
                    l++;
                    r--;

                } 
                else if (sum < target) {
                    l++;
                } 
                else {
                    r--;
                }
            }
        }

        return count;
    }
}