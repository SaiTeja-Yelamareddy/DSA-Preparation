/*
 * Platform: GeeksforGeeks
 * Problem ID: counting-number-of-sentences-and-words-in-text3226
 * Problem: Count Sentences and Words
 * Problem Link: https://www.geeksforgeeks.org/problems/counting-number-of-sentences-and-words-in-text3226/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public static ArrayList<Integer> countSentencesAndWords(String s) {

        int sentenceCount = 0;
        int wordCount = 0;

        boolean insideWord = false;
        boolean sentenceHasContent = false;
        boolean previousWasEnd = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z')) {
                if (!insideWord) {
                    wordCount++;
                    insideWord = true;
                }

                sentenceHasContent = true;
                previousWasEnd = false;

            } else {
                insideWord = false;
            }
            if (ch == '.' || ch == '!' || ch == '?') {

                if (sentenceHasContent && !previousWasEnd) {
                    sentenceCount++;
                }

                previousWasEnd = true;
            }
        }

        if (sentenceHasContent && !previousWasEnd) {
            sentenceCount++;
        }

        ArrayList<Integer> result = new ArrayList<>();

        result.add(sentenceCount);
        result.add(wordCount);

        return result;
    }
}