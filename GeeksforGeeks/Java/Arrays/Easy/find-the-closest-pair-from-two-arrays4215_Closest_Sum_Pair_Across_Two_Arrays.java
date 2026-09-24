/*
 * Platform: GeeksforGeeks
 * Problem ID: find-the-closest-pair-from-two-arrays4215
 * Problem: Closest Sum Pair Across Two Arrays
 * Problem Link: https://www.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public ArrayList<Integer> findClosestPair(int[] arr1, int[] arr2, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = arr2.length - 1;
        int minDiff = Integer.MAX_VALUE;
        while (i < arr1.length && j >= 0) {
            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(sum - x);
            if (diff < minDiff) {
                minDiff = diff;
                ans.clear();
                ans.add(arr1[i]);
                ans.add(arr2[j]);
            }
            if (sum < x) {
                i++;
            }
            else {
                j--;
            }
        }
        return ans;
    }
}