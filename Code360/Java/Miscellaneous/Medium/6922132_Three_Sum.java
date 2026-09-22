/*
 * Platform: Code360
 * Problem ID: 6922132
 * Problem: Three Sum
 * Problem Link: https://www.naukri.com/code360/problems/three-sum_6922132
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

public class Solution {

    public static ArrayList<ArrayList<Integer>> triplet(int n, int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

         Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first element
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = n - 1;

            while (l < r) {

                int sum = arr[i] + arr[l] + arr[r];

                if (sum == 0) {

                    ArrayList<Integer> temp = new ArrayList<>();

                    temp.add(arr[i]);
                    temp.add(arr[l]);
                    temp.add(arr[r]);

                    ans.add(temp);

                    l++;
                    r--;

                    // Skip duplicate left values
                    while (l < r && arr[l] == arr[l - 1]) {
                        l++;
                    }

                    // Skip duplicate right values
                    while (l < r && arr[r] == arr[r + 1]) {
                        r--;
                    }

                } 
                else if (sum < 0) {
                    l++;
                } 
                else {
                    r--;
                }
            }
        }

        return ans;
    }
}