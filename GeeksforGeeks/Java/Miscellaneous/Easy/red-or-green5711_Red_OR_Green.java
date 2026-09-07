/*
 * Platform: GeeksforGeeks
 * Problem ID: red-or-green5711
 * Problem: Red OR Green
 * Problem Link: https://www.geeksforgeeks.org/problems/red-or-green5711/1
 * Language: Java
 * Concept: Miscellaneous
 * Status: ACCEPTED
 */

class Solution {
    public int redOrGreen(String s) {
        // code here
        int[] arr = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                arr[0]++;
            else
                arr[1]++;
        }
        return Math.min(arr[0], arr[1]);
    }
}