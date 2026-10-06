/*
 * Platform: Code360
 * Problem ID: 1082549
 * Problem: First and Last Position of an Element In Sorted Array - Naukri Code 360
 * Problem Link: https://www.naukri.com/code360/problems/first-and-last-position-of-an-element-in-sorted-array_1082549
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.*;
public class Solution {
    public static int firstSearch(ArrayList<Integer> arr, int k) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == k) {
                ans = mid;
                r = mid - 1;
            }
            else if (arr.get(mid) < k) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }
    public static int lastSearch(ArrayList<Integer> arr, int k) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == k) {
                ans = mid;
                l = mid + 1;
            }
            else if (arr.get(mid) < k) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = firstSearch(arr, k);
        int last = lastSearch(arr, k);
        return new int[]{first, last};
    }
}