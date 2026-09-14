/*
 * Platform: GeeksforGeeks
 * Problem ID: reverse-words-in-a-given-string5459
 * Problem: Reverse Words
 * Problem Link: https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\.+");

        ArrayList<String> list = new ArrayList<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                list.add(word);
            }
        }

        Collections.reverse(list);

        return String.join(".", list);
    }
}