/*
 * Platform: GeeksforGeeks
 * Problem ID: snake-case0219
 * Problem: Snake Case
 * Problem Link: https://www.geeksforgeeks.org/problems/snake-case0219/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String SnakeCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                result.append('_');
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();
    }
}