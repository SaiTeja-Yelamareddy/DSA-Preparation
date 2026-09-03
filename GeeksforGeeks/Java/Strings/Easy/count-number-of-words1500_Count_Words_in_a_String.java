/*
 * Platform: GeeksforGeeks
 * Problem ID: count-number-of-words1500
 * Problem: Count Words in a String
 * Problem Link: https://www.geeksforgeeks.org/problems/count-number-of-words1500/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int countWords(String s) {
        // code here
        int count = 0;
        boolean insideWord = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (!insideWord) {
                    count++;
                    insideWord = true;
                }
            } else {
                insideWord = false;
            }
        }
        return count;
    }
}