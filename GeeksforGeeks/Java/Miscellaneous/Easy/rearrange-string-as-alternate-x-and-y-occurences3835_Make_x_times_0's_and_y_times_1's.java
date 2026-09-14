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
        StringBuilder ans = new StringBuilder();
        while (zeros >= x && ones >= y) {

            for (int i = 0; i < x; i++) {
                ans.append('0');
            }

            for (int i = 0; i < y; i++) {
                ans.append('1');
            }

            zeros -= x;
            ones -= y;
        }
        while (zeros > 0) {
            ans.append('0');
            zeros--;
        }

        while (ones > 0) {
            ans.append('1');
            ones--;
        }

        return ans.toString();
    }
}