/*
 * Platform: CodeChef
 * Problem ID: SESO41
 * Problem: Complete the implementation in Searching and Sorting Algorithms
 * Problem Link: https://www.codechef.com/learn/course/searching-sorting/SORTSEARCH5/problems/SESO41
 * Language: Java
 * Concept: Sorting
 * Difficulty: Medium
 * Course: Searching Sorting
 * Module: SORTSEARCH5
 * Status: ACCEPTED
 */

public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
     
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
    }
}
