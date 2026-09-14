/*
 * Platform: GeeksforGeeks
 * Problem ID: remove-all-duplicates-from-a-given-string4321
 * Problem: String Duplicates Removal
 * Problem Link: https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String removeDuplicates(String s) {
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }

        return result.toString();
    }
}