/*
 * Platform: GeeksforGeeks
 * Problem ID: encrypt-the-string-21117
 * Problem: Encrypt the string - 2
 * Problem Link: https://www.geeksforgeeks.org/problems/encrypt-the-string-21117/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String encryptString(String S) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < S.length()) {
            char ch = S.charAt(i);
            int count = 0;
            while (i < S.length() && S.charAt(i) == ch) {
                count++;
                i++;
            }
            result.append(ch);
            result.append(Integer.toHexString(count));
        }
        return result.reverse().toString();
    }
}