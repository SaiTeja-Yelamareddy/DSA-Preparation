/*
 * Platform: GeeksforGeeks
 * Problem ID: remove-spaces0128
 * Problem: Remove Spaces
 * Problem Link: https://www.geeksforgeeks.org/problems/remove-spaces0128/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String removeSpaces(String s) {
        // code here
        String[] arr = s.split(" ");
        String result = String.join("", arr);
        return result;
    }
}