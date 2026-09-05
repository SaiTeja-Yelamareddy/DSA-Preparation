/*
 * Platform: GeeksforGeeks
 * Problem ID: run-length-encoding
 * Problem: Run Length Encoding
 * Problem Link: https://www.geeksforgeeks.org/problems/run-length-encoding/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String encode(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length() - 1));
        sb.append(count);

        return sb.toString();
    }
}