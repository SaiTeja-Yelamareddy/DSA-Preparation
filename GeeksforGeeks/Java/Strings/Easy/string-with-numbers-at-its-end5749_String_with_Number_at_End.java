/*
 * Platform: GeeksforGeeks
 * Problem ID: string-with-numbers-at-its-end5749
 * Problem: String with Number at End
 * Problem Link: https://www.geeksforgeeks.org/problems/string-with-numbers-at-its-end5749/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    int isSame(String s) {
        int i = s.length() - 1;
        while (i >= 0 && Character.isDigit(s.charAt(i))) {
            i--;
        }
        String num = s.substring(i + 1);
        num = num.replaceFirst("^0+", "");
        if (num.length() == 0)
            num = "0";
        int len = i + 1;
        if (num.equals(String.valueOf(len)))
            return 1;
        return 0;
    }
}