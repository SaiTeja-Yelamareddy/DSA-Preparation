/*
 * Platform: GeeksforGeeks
 * Problem ID: missing-characters-in-panagram
 * Problem: Missing Characters in Panagram
 * Problem Link: https://www.geeksforgeeks.org/problems/missing-characters-in-panagram/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */


class Solution {
    public String  missingPanagram(String s) {
        boolean[] seen = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (!seen[i]) {
                result.append((char) ('a' + i));
            }
        }
        if (result.length() == 0) {
            return "-1";
        }
        return result.toString();
    }
}