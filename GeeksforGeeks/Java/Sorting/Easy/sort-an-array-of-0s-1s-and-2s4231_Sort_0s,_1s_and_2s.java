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
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                count0++;
            } 
            else if (arr[i] == 1) {
                count1++;
            } 
            else {
                count2++;
            }
        }
        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr[index] = 0;
            index++;
        }
        for (int i = 0; i < count1; i++) {
            arr[index] = 1;
            index++;
        }

        // Put 2s
        for (int i = 0; i < count2; i++) {
            arr[index] = 2;
            index++;
        }
    }
}