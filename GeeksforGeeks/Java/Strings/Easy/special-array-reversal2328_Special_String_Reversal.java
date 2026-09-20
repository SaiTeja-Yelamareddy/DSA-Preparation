/*
 * Platform: GeeksforGeeks
 * Problem ID: special-array-reversal2328
 * Problem: Special String Reversal
 * Problem Link: https://www.geeksforgeeks.org/problems/special-array-reversal2328/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String reverseString(String s) {
        // code here
        char[] sarr=s.toCharArray();
        int l=0,r=sarr.length-1;
        while(l<r)
        {
            char temp=sarr[l];
            sarr[l]=sarr[r];
            sarr[r]=temp;
            l++;
            r--;
        }
        return new String(sarr);
    }
}