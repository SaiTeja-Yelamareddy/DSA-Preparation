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
        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            if (i + s1.length() <= s.length()
                    && s.regionMatches(i, s1, 0, s1.length())) {

                result.append(s2);
                i += s1.length();

            } else {
                result.append(s.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}