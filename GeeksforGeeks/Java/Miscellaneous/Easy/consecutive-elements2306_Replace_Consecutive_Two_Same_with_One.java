/*
 * Platform: GeeksforGeeks
 * Problem ID: consecutive-elements2306
 * Problem: Replace Consecutive Two Same with One
 * Problem Link: https://www.geeksforgeeks.org/problems/consecutive-elements2306/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();

        result.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}