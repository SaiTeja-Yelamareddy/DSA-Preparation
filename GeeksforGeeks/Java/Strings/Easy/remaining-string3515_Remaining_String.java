/*
 * Platform: GeeksforGeeks
 * Problem ID: remaining-string3515
 * Problem: Remaining String
 * Problem Link: https://www.geeksforgeeks.org/problems/remaining-string3515/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String remainingString(String s, char ch, int count) {
        int found = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                found++;

                if (found == count) {
                    return s.substring(i + 1);
                }
            }
        }
        return "";
    }
}