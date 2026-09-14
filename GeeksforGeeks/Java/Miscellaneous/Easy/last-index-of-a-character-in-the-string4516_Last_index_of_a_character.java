/*
 * Platform: GeeksforGeeks
 * Problem ID: last-index-of-a-character-in-the-string4516
 * Problem: Last index of a character
 * Problem Link: https://www.geeksforgeeks.org/problems/last-index-of-a-character-in-the-string4516/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */


class Solution {
    public int LastIndex(String s, char c) {

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }
}