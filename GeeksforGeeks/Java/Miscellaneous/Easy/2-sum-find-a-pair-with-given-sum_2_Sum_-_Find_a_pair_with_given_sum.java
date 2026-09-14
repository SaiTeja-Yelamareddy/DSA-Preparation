/*
 * Platform: GeeksforGeeks
 * Problem ID: 2-sum-find-a-pair-with-given-sum
 * Problem: 2 Sum - Find a pair with given sum
 * Problem Link: https://www.geeksforgeeks.org/problems/2-sum-find-a-pair-with-given-sum/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */


class Solution {
    public int[] twoSum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            int needed = target - num;

            if (list.contains(needed)) {
                return new int[]{needed, num};
            }

            list.add(num);
        }

        return new int[]{};
    }
}