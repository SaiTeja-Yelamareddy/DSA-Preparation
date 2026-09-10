/*
 * Platform: GeeksforGeeks
 * Problem ID: check-palindrome--141628
 * Problem: Check Palindrome
 * Problem Link: https://www.geeksforgeeks.org/problems/check-palindrome--141628/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public static boolean isPalindrome(String s) {
        // code here
        s = s.toLowerCase();
              int left = 0;
              int right = s.length() - 1;
              while (left < right) {
                  if (s.charAt(left) != s.charAt(right)) {
                      return false;
                  }
                  left++;
                  right--;
              }
              return true;
    }
}