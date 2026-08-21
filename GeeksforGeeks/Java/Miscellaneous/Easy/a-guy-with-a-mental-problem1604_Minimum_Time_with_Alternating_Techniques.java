/*
 * Platform: GeeksforGeeks
 * Problem ID: a-guy-with-a-mental-problem1604
 * Problem: Minimum Time with Alternating Techniques
 * Problem Link: https://www.geeksforgeeks.org/problems/a-guy-with-a-mental-problem1604/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int minTime(int[] a, int[] b) {
        // code here
        int time1 = 0;
        int time2 = 0;
        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                time1 += a[i];
                time2 += b[i];
            }
            else {
                time1 += b[i];
                time2 += a[i];
            }
        }
        return Math.min(time1, time2);
    }
}