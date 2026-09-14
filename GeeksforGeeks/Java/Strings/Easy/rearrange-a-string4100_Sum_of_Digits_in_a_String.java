/*
 * Platform: GeeksforGeeks
 * Problem ID: rearrange-a-string4100
 * Problem: Sum of Digits in a String
 * Problem Link: https://www.geeksforgeeks.org/problems/rearrange-a-string4100/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String arrangeString(String s) {
        int[] freq = new int[26];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A']++;
            } else {
                sum += ch - '0';
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                result.append((char) ('A' + i));
                freq[i]--;
            }
        }
        result.append(sum);
       return result.toString();
    }
}