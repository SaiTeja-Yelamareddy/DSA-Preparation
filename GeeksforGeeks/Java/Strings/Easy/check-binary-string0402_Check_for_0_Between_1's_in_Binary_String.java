/*
 * Platform: GeeksforGeeks
 * Problem ID: check-binary-string0402
 * Problem: Check for 0 Between 1's in Binary String
 * Problem Link: https://www.geeksforgeeks.org/problems/check-binary-string0402/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean checkBinary(String s) {
        // code here
            boolean foundZero = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    foundZero = true;
                }
                if (s.charAt(i) == '1' && foundZero) {
                    return false;
                }
            }
            return true;   
    }
}