/*
 * Platform: Code360
 * Problem ID: 1235236
 * Problem: Reverse Only Letters - Naukri Code 360
 * Problem Link: https://www.naukri.com/code360/problems/reverse-only-letters_1235236
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.* ;
import java.io.*; 
public class Solution {
    public static String reverseOnlyLetters(String s) {
        // Write your code here.
        char[] sarr = s.toCharArray();
        int l = 0, r = sarr.length - 1;
        while (l < r) {
            if (Character.isLetter(sarr[l]) && Character.isLetter(sarr[r])) {
                char temp = sarr[l];
                sarr[l] = sarr[r];
                sarr[r] = temp;

                l++;
                r--;
            }
            else if (!Character.isLetter(sarr[l])) {
                l++;
            }
            else if (!Character.isLetter(sarr[r])) {
                r--;
            }
        }
        return new String(sarr);
    }
}