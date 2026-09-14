/*
 * Platform: GeeksforGeeks
 * Problem ID: rearrange-string-as-alternate-x-and-y-occurences3835
 * Problem: Make x times 0's and y times 1's
 * Problem Link: https://www.geeksforgeeks.org/problems/rearrange-string-as-alternate-x-and-y-occurences3835/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String arrangeString(String s, int x, int y) {
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }
        }

        StringBuilder result = new StringBuilder();

        while (zeros > 0 && ones > 0) {
            int z = Math.min(x, zeros);
            for (int i = 0; i < z; i++) {
                result.append('0');
            }
       
            int o = Math.min(y, ones);
            for (int i = 0; i < o; i++) {
                result.append('1');
            }
            ones -= o;
        }

        // Add remaining characters
        while (zeros > 0) {
            result.append('0');
            zeros--;
        }

        while (ones > 0) {
            result.append('1');
            ones--;
        }

        return result.toString();
    }
}