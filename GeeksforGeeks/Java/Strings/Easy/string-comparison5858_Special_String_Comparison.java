/*
 * Platform: GeeksforGeeks
 * Problem ID: string-comparison5858
 * Problem: Special String Comparison
 * Problem Link: https://www.geeksforgeeks.org/problems/string-comparison5858/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int compareStrings(String s1, String s2) {
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            int rank1;
            int rank2;
            int len1 = 1;
            int len2 = 1;
            if (i + 1 < s1.length() &&
                s1.charAt(i) == 'n' &&
                s1.charAt(i + 1) == 'g') {
                rank1 = 14;
                len1 = 2;
            } else {
                rank1 = s1.charAt(i) - 'a';
            }

            if (j + 1 < s2.length() &&
                s2.charAt(j) == 'n' &&
                s2.charAt(j + 1) == 'g') {
                rank2 = 14;
                len2 = 2;
            } else {
                rank2 = s2.charAt(j) - 'a';
            }

            if (rank1 > rank2) {
                return 1;
            }

            if (rank1 < rank2) {
                return -1;
            }

            i += len1;
            j += len2;
        }
        if (i == s1.length() && j == s2.length()) {
            return 0;
        }
        if (i < s1.length()) {
            return 1;
        }

        return -1;
    }
}