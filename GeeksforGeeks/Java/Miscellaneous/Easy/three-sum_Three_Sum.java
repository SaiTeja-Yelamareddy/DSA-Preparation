/*
 * Platform: GeeksforGeeks
 * Problem ID: three-sum
 * Problem: Three Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/three-sum/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = n - 1;

            while (l < r) {

                int sum = arr[i] + arr[l] + arr[r];

                if (sum == 0) {

                    ArrayList<Integer> triplet = new ArrayList<>();

                    triplet.add(arr[i]);
                    triplet.add(arr[l]);
                    triplet.add(arr[r]);

                    ans.add(triplet);

                    l++;
                    r--;

                    while (l < r && arr[l] == arr[l - 1]) {
                        l++;
                    }

                    while (l < r && arr[r] == arr[r + 1]) {
                        r--;
                    }

                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return ans;
    }
}