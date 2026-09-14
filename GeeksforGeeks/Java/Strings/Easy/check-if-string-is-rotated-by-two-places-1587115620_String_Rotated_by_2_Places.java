/*
 * Platform: GeeksforGeeks
 * Problem ID: check-if-string-is-rotated-by-two-places-1587115620
 * Problem: String Rotated by 2 Places
 * Problem Link: https://www.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean isRotated(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int n = s1.length();
        String left = s1.substring(2 % n) + s1.substring(0, 2 % n);
        String right = s1.substring(n - (2 % n)) + s1.substring(0, n - (2 % n));
        return s2.equals(left) || s2.equals(right);
    }
}