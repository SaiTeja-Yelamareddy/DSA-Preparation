/*
 * Platform: GeeksforGeeks
 * Problem ID: urlify-a-given-string--141625
 * Problem: URLify a given string
 * Problem Link: https://www.geeksforgeeks.org/problems/urlify-a-given-string--141625/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    static String URLify(String s) {
        // code here
         return s.replace(" ", "%20");
    }
}