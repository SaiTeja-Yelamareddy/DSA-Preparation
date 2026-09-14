/*
 * Platform: GeeksforGeeks
 * Problem ID: riyas-test1450
 * Problem: Same Frequency in Two Halves
 * Problem Link: https://www.geeksforgeeks.org/problems/riyas-test1450/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */


class Solution {
    public boolean halvesMatch(String s) {

        int n = s.length();
        int half = n / 2;
        int[] count1 = new int[256];
        int[] count2 = new int[256];
        for (int i = 0; i < half; i++) {
            count1[s.charAt(i)]++;
        }

        for (int i = n - half; i < n; i++) {
            count2[s.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}