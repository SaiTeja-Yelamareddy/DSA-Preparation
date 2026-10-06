/*
 * Platform: CodeChef
 * Problem ID: UPPERBOUND1
 * Problem: Upper Bound in a Sorted Array Practice Problem in Binary Search
 * Problem Link: https://www.codechef.com/practice/course/binary-search/INTBINS01/problems/UPPERBOUND1
 * Language: Java
 * Concept: BinarySearch
 * Difficulty: Medium
 * Status: ACCEPTED
 */

 static int upperBound(int[] nums, int x) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
