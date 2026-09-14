/*
 * Platform: GeeksforGeeks
 * Problem ID: three-consecutive-duplicates2434
 * Problem: Repeated Removal of 3 Consecutive Duplicates
 * Problem Link: https://www.geeksforgeeks.org/problems/three-consecutive-duplicates2434/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String reducedString(String s) {
        StringBuilder stack = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.append(ch);
            int n = stack.length();
            if (n >= 3 &&
                stack.charAt(n - 1) == ch &&
                stack.charAt(n - 2) == ch &&
                stack.charAt(n - 3) == ch) {

                stack.delete(n - 3, n);
            }
        }

        if (stack.length() == 0) {
            return "-1";
        }

        return stack.toString();
    }
}