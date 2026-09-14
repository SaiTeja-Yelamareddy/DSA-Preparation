/*
 * Platform: GeeksforGeeks
 * Problem ID: difficulty-of-sentence5856
 * Problem: Difficulty of a Sentence
 * Problem Link: https://www.geeksforgeeks.org/problems/difficulty-of-sentence5856/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int calcDiff(String s) {
        String[] words = s.split(" ");

        int score = 0;

        for (String word : words) {
            int vowels = 0;
            int consonants = 0;
            int consecutive = 0;
            boolean hard = false;

            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));

                if (isVowel(ch)) {
                    vowels++;
                    consecutive = 0;
                } else {
                    consonants++;
                    consecutive++;

                    if (consecutive == 4) {
                        hard = true;
                    }
                }
            }

            if (consonants > vowels) {
                hard = true;
            }

            if (hard) {
                score += 5;
            } else {
                score += 3;
            }
        }

        return score;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}