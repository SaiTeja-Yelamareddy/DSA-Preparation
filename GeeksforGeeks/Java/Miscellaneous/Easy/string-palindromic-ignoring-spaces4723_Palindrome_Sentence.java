/*
 * Platform: GeeksforGeeks
 * Problem ID: string-palindromic-ignoring-spaces4723
 * Problem: Palindrome Sentence
 * Problem Link: https://www.geeksforgeeks.org/problems/string-palindromic-ignoring-spaces4723/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean isPalinSent(String s) {
        // code here
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

               for (int i = 0; i < s.length(); i++) {
                   if (Character.isLetterOrDigit(s.charAt(i))) {
                       sb.append(s.charAt(i));
                   }
               }
               String str = sb.toString();
               int left = 0;
               int right = str.length() - 1;

               while (left < right) {
                   if (str.charAt(left) != str.charAt(right)) {
                       return false;
                   }

                   left++;
                   right--;
               }
               return true;
    }
}