/*
 * Platform: GeeksforGeeks
 * Problem ID: sandwiched-vowels5158
 * Problem: Remove Sandwiched Vowels
 * Problem Link: https://www.geeksforgeeks.org/problems/sandwiched-vowels5158/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String sandwichedVowel(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (isVowel(ch)) {
                if (i > 0 && i < s.length() - 1 &&
                    !isVowel(s.charAt(i - 1)) &&
                    !isVowel(s.charAt(i + 1))) {
                    continue;
                }
            }
            result.append(ch);
        }
        return result.toString();
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}