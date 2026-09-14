/*
 * Platform: GeeksforGeeks
 * Problem ID: just-one-mismatch1714
 * Problem: Just One Mismatch
 * Problem Link: https://www.geeksforgeeks.org/problems/just-one-mismatch1714/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean isStringExist(String s, String[] arr) {
        // code here
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != arr.charAt(i)) {
                count++;
            }
        }

        if (count == 1)
            return true;
    }
}