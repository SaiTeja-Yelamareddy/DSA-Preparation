/*
 * Platform: GeeksforGeeks
 * Problem ID: find-transition-point-1587115620
 * Problem: Transition Point in Sorted Binary
 * Problem Link: https://www.geeksforgeeks.org/problems/find-transition-point-1587115620/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int l = 0;
                int r = arr.length - 1;
                int ans = -1;
                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    if (arr[mid] == 1) {
                        ans = mid;
                        r = mid - 1;
                    }
                    else {
                        l = mid + 1;
                    }
                }

                return ans;
    }
}