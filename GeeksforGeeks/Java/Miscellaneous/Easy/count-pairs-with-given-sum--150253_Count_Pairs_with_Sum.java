/*
 * Platform: GeeksforGeeks
 * Problem ID: count-pairs-with-given-sum--150253
 * Problem: Count Pairs with Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum--150253/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int countPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int needed = target - num;

            if (map.containsKey(needed)) {
                count += map.get(needed);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}