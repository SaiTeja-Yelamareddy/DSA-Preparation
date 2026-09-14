/*
 * Platform: GeeksforGeeks
 * Problem ID: crazy-string1157
 * Problem: Alternate Lowercase and Uppercase
 * Problem Link: https://www.geeksforgeeks.org/problems/crazy-string1157/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String altCase(String s) {

        StringBuilder result = new StringBuilder();
        boolean firstUpper = Character.isUpperCase(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (firstUpper) {
                if (i % 2 == 0) {
                    result.append(Character.toUpperCase(ch));
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            } else {
                if (i % 2 == 0) {
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(Character.toUpperCase(ch));
                }
            }
        }
        return result.toString();
    }
}