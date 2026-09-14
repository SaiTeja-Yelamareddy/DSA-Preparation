/*
 * Platform: GeeksforGeeks
 * Problem ID: reverse-each-word-in-a-given-string1001
 * Problem: Reverse each word in a given string
 * Problem Link: https://www.geeksforgeeks.org/problems/reverse-each-word-in-a-given-string1001/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                result.append(word.charAt(j));
            }

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}