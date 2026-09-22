/*
 * Platform: GeeksforGeeks
 * Problem ID: find-all-triplets-with-zero-sum
 * Problem: All Triplets with Zero Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/find-all-triplets-with-zero-sum/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int needed = -(arr[i] + arr[j]);
                if (map.containsKey(needed)) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(i);
                    triplet.add(map.get(needed));
                    triplet.add(j);
                    ans.add(triplet);
                }

                map.put(arr[j], j);
            }
        }

        return ans;
    }
}