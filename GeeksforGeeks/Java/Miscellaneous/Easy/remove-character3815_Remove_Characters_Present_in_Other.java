/*
 * Platform: GeeksforGeeks
 * Problem ID: remove-character3815
 * Problem: Remove Characters Present in  Other
 * Problem Link: https://www.geeksforgeeks.org/problems/remove-character3815/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String removeChars(String s1, String s2) {
        boolean[] present = new boolean[26];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s2.length(); i++) {
            present[s2.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (!present[ch - 'a']) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}