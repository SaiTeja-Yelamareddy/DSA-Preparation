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
    static boolean check_duck(String num) {
        // code here
        for (int i = 1; i < num.length(); i++) {
                    if (num.charAt(i) == '0') {
                        return true;
                    }
                }

                return false;
    }
}