/*
 * Platform: GeeksforGeeks
 * Problem ID: sort-an-array-of-0s-1s-and-2s4231
 * Problem: Sort 0s, 1s and 2s
 * Problem Link: https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
 * Language: Java
 * Concept: Sorting
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }
}