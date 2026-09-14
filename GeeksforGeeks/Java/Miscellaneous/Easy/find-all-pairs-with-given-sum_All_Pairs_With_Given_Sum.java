/*
 * Platform: GeeksforGeeks
 * Problem ID: find-all-pairs-with-given-sum
 * Problem: All Pairs With Given Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/find-all-pairs-with-given-sum/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public ArrayList<ArrayList<Integer>> findAllPairs(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);

                    result.add(pair);
                }
            }
        }

        return result;
    }
}