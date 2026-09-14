/*
 * Platform: GeeksforGeeks
 * Problem ID: decode-it1646
 * Problem: Kth Character in an Encoded String
 * Problem Link: https://www.geeksforgeeks.org/problems/decode-it1646/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public char decodeIt(String s, long k) {

        long length = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                length++;
            } else {
                int digit = ch - '0';
                length *= digit;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                length /= digit;
                k = (k - 1) % length + 1;
            } else {
                if (k == length) {
                    return ch;
                }

                length--;
            }
        }

        return ' ';
    }
}