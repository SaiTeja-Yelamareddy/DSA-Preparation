/*
 * Platform: Code360
 * Problem ID: 893025
 * Problem: 2 Sum
 * Problem Link: https://www.naukri.com/code360/problems/2-sum_893025
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

public class Solution {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            // Store only the first index
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}