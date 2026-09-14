/*
 * Platform: GeeksforGeeks
 * Problem ID: 2-sum-count-distinct-pairs-with-given-sum
 * Problem: Count Distinct Pairs with Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/2-sum-count-distinct-pairs-with-given-sum/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */


class Solution {
    public int countDistinctPairs(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> pairs = new HashSet<>();
        for (int num : arr) {
            int needed = target - num;
            if (set.contains(needed)) {
                int a = Math.min(num, needed);
                int b = Math.max(num, needed);
                pairs.add(a + "," + b);
            }
            set.add(num);
        }
        return pairs.size();
    }
}
