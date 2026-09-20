/*
 * Platform: GeeksforGeeks
 * Problem ID: special-array-reversal2328
 * Problem: Special String Reversal
 * Problem Link: https://www.geeksforgeeks.org/problems/special-array-reversal2328/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String reverseString(String s) {
        char[] sarr = s.toCharArray();
        int l = 0, r = sarr.length - 1;
        while (l < r) {
            if (Character.isLetter(sarr[l]) && Character.isLetter(sarr[r])) {
                char temp = sarr[l];
                sarr[l] = sarr[r];
                sarr[r] = temp;

                l++;
                r--;
            }
            else if (!Character.isLetter(sarr[l])) {
                l++;
            }
            else if (!Character.isLetter(sarr[r])) {
                r--;
            }
        }
        return new String(sarr);
    }
}