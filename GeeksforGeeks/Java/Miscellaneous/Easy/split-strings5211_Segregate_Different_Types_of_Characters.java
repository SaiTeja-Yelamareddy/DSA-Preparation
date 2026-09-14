/*
 * Platform: GeeksforGeeks
 * Problem ID: split-strings5211
 * Problem: Segregate Different Types of Characters
 * Problem Link: https://www.geeksforgeeks.org/problems/split-strings5211/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */


class Solution {
    public String[] splitString(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder special = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                letters.append(ch);
            }
            else if (Character.isDigit(ch)) {
                digits.append(ch);
            }
            else {
                special.append(ch);
            }
        }
        String s1 = letters.length() == 0 ? "-1" : letters.toString();
        String s2 = digits.length() == 0 ? "-1" : digits.toString();
        String s3 = special.length() == 0 ? "-1" : special.toString();
        return new String[]{s1, s2, s3};
    }
}
