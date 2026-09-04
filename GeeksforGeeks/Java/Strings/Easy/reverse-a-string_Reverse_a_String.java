/*
 * Platform: GeeksforGeeks
 * Problem ID: reverse-a-string
 * Problem: Reverse a String
 * Problem Link: https://www.geeksforgeeks.org/problems/reverse-a-string/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}