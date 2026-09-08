/*
 * Platform: Code360
 * Problem ID: 699836
 * Problem: Encode the Message - Naukri Code 360
 * Problem Link: https://www.naukri.com/code360/problems/encode-the-message_699836
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.* ;
import java.io.*; 
public class Solution {
	public static String encode(String s) {
		// Write your code here.
		StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length() - 1));
        sb.append(count);

        return sb.toString();
	}
}