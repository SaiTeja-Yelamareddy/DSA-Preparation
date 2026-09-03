/*
 * Platform: GeeksforGeeks
 * Problem ID: count-the-characters-in-each-word-in-a-given-sentence3451
 * Problem: Word Lengths
 * Problem Link: https://www.geeksforgeeks.org/problems/count-the-characters-in-each-word-in-a-given-sentence3451/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    ArrayList<Integer> wordLengths(String s) {
        // code here
        String[] sarr=s.split(" ");
        ArrayList<Integer> al=new ArrayList<>();
        for(String s1:sarr)
        {
            al.add(s1.length());
        }
        return al;
    }
}