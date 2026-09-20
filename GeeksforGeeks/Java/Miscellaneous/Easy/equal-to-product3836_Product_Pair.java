/*
 * Platform: GeeksforGeeks
 * Problem ID: equal-to-product3836
 * Problem: Product Pair
 * Problem Link: https://www.geeksforgeeks.org/problems/equal-to-product3836/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean isProduct(int[] arr, long target) {
        // code here
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
        long product = (long) arr[left] * arr[right];
        if (product == target) {
            return true;
           }
        else if (product < target) {
            left++;
            }
        else {
            right--;
            }
       }
        return false;
    }
}