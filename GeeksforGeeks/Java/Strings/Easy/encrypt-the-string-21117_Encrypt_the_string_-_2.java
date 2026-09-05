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

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                count++;
            } else {
                sb.append(S.charAt(i - 1));
                sb.append(Integer.toHexString(count));

                count = 1;
            }
        }
        sb.append(S.charAt(S.length() - 1));
        sb.append(Integer.toHexString(count));
        return sb.reverse().toString();
    }
}