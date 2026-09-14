/*
 * Platform: GeeksforGeeks
 * Problem ID: replace-a-word5553
 * Problem: Replace Word
 * Problem Link: https://www.geeksforgeeks.org/problems/replace-a-word5553/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String replaceAll(String s, String s1, String s2) {

        int n = s.length();
        int m = s1.length();
        int[] lps = new int[m];

        for (int i = 1, len = 0; i < m; ) {
            if (s1.charAt(i) == s1.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        int last = 0;
        while (i < n) {

            if (s.charAt(i) == s1.charAt(j)) {
                i++;
                j++;

                // Found s1
                if (j == m) {
                    int start = i - m;

                    result.append(s, last, start);
                    result.append(s2);

                    last = i;
                    j = 0;
                }

            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }

        // Add remaining part
        result.append(s, last, n);

        return result.toString();
    }
}