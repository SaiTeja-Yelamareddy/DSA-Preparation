/*
 * Platform: Code360
 * Problem ID: 1825401
 * Problem: Ceil The Floor
 * Problem Link: https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

public class Solution {

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int l = 0;
        int r = n - 1;
        int floor = -1;
        int ceil = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == x) {
                floor = a[mid];
                ceil = a[mid];
                break;
            }
            else if (a[mid] < x) {
                floor = a[mid];
                l = mid + 1;
            }
            else {
                ceil = a[mid];
                r = mid - 1;
            }
        }
        return new int[]{floor, ceil};
    }
}