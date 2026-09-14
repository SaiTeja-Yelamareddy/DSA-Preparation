/*
 * Platform: GeeksforGeeks
 * Problem ID: count-distinct-vowels-in-string
 * Problem: Count Distinct Vowels in String
 * Problem Link: https://www.geeksforgeeks.org/problems/count-distinct-vowels-in-string/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */


class Solution {
    public int countVowels(String s) {
        HashSet<Character> vowels = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels.add(ch);
            }
        }
        return vowels.size();
    }
}