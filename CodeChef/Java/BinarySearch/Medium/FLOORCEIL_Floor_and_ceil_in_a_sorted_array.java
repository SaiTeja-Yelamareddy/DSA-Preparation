/*
 * Platform: CodeChef
 * Problem ID: FLOORCEIL
 * Problem: Floor and ceil in a sorted array Practice Problem in Binary Search
 * Problem Link: https://www.codechef.com/practice/course/binary-search/INTBINS01/problems/FLOORCEIL
 * Language: Java
 * Concept: BinarySearch
 * Status: ACCEPTED
 */

class Solution {
    public int[] findFloorCeil(int[] arr, int k) {
        int n = arr.length;
        int floor = -1;
        int ceil = -1;

        // Binary search for floor
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return new int[] {k, k};
            } else if (arr[mid] < k) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Binary search for ceil
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= k) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] {floor, ceil};
    }
}
