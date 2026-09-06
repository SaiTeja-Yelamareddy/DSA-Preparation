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
        // code here
        int len=Integer.valueOf(s.charAt(s.length()-1));
        int slen=s.length();
        if(len==slen)
        return 1;
        return 0;
    }
}