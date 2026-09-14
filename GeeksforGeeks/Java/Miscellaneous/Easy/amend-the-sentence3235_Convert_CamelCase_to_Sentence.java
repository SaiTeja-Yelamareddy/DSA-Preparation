/*
 * Platform: GeeksforGeeks
 * Problem ID: amend-the-sentence3235
 * Problem: Convert CamelCase to Sentence
 * Problem Link: https://www.geeksforgeeks.org/problems/amend-the-sentence3235/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String amendSentence(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch) && i > 0) {
                result.append(' ');
            }

            result.append(Character.toLowerCase(ch));
        }

        return result.toString();
    }
}