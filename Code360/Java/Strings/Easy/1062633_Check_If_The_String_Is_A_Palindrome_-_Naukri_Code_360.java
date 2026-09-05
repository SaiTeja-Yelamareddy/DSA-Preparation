/*
 * Platform: Code360
 * Problem ID: 1062633
 * Problem: Check If The String Is A Palindrome - Naukri Code 360
 * Problem Link: https://www.naukri.com/code360/problems/check-if-the-string-is-a-palindrome_1062633
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.* ;
import java.io.*; 
public class Solution {

	public static boolean checkPalindrome(String s) {
	
	    // WRITE YOUR CODE HERE	
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