/*
 * Platform: Code360
 * Problem ID: 920447
 * Problem: Floor Value of X - Naukri Code 360
 * Problem Link: https://www.naukri.com/code360/problems/find-floor-value_920447
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

public class Solution {

    public static int floorSearch(int[] arr, int x, int n) {

        int l = 0;
        int r = n - 1;
        int ans = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] <= x) {
                ans = arr[mid];
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return ans;
    }
}