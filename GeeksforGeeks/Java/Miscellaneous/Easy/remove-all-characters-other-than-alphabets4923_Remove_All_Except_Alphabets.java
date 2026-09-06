/*
 * Platform: GeeksforGeeks
 * Problem ID: remove-all-characters-other-than-alphabets4923
 * Problem: Remove All Except Alphabets
 * Problem Link: https://www.geeksforgeeks.org/problems/remove-all-characters-other-than-alphabets4923/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String removeChars(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
};