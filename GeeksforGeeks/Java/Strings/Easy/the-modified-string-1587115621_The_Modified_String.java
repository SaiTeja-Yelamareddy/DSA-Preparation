/*
 * Platform: GeeksforGeeks
 * Problem ID: the-modified-string-1587115621
 * Problem: The Modified String
 * Problem Link: https://www.geeksforgeeks.org/problems/the-modified-string-1587115621/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int modified(String s) {
        int count = 0;
        int insertions = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count == 3) {
                insertions++;
                count = 1;
            }
        }

        return insertions;
    }
}