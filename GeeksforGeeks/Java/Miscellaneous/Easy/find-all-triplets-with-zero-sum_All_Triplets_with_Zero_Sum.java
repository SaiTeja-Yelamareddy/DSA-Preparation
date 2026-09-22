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

import java.util.*;

class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(i);
                        temp.add(j);
                        temp.add(k);
                        ans.add(temp);
                    }
                }
            }
        }

        return ans;
    }
}