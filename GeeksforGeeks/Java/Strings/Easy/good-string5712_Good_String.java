/*
 * Platform: GeeksforGeeks
 * Problem ID: good-string5712
 * Problem: Good String
 * Problem Link: https://www.geeksforgeeks.org/problems/good-string5712/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean isGoodString(String s) {
        // code here
        
        for (int i = 0; i < s.length() - 1; i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));
            if (diff != 1 && diff != 25) {
                return false;
            }
        }
        return true;
    }
}