/*
 * Platform: GeeksforGeeks
 * Problem ID: palindrome-string0817
 * Problem: Palindrome String
 * Problem Link: https://www.geeksforgeeks.org/problems/palindrome-string0817/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    boolean isPalindrome(String s) {
        // code here
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            return false;
            left++;
            right--;
        }
        return true;
    }
}