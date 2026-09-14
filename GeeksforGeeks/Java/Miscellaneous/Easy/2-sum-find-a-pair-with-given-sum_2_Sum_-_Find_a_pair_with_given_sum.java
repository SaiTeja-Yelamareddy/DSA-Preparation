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
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            int needed = target - num;
            if (list.contains(needed)) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(needed);
                result.add(num);
                return result;
            }
            list.add(num);
        }

        return new ArrayList<>();
    }
}