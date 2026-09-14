/*
 * Platform: GeeksforGeeks
 * Problem ID: search-a-character-in-a-string
 * Problem: Search a Character in a String
 * Problem Link: https://www.geeksforgeeks.org/problems/search-a-character-in-a-string/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int searchCharacter(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                return i;
            }
        }

        return -1;
    }
}