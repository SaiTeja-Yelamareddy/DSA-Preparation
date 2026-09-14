/*
 * Platform: GeeksforGeeks
 * Problem ID: zero-number2158
 * Problem: Duck Number
 * Problem Link: https://www.geeksforgeeks.org/problems/zero-number2158/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */


class Solution {
    public boolean check_duck(String num) {
        int i = 0;
        while (i < num.length() && num.charAt(i) == '0') {
            i++;
        }
        while (i < num.length()) {
            if (num.charAt(i) == '0') {
                return true;
            }
            i++;
        }

        return false;
    }
}