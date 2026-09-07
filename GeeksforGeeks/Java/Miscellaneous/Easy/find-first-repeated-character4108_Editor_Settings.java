/*
 * Platform: GeeksforGeeks
 * Problem ID: find-first-repeated-character4108
 * Problem: Editor Settings
 * Problem Link: https://www.geeksforgeeks.org/problems/find-first-repeated-character4108/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    String firstRepChar(String s) {
        // code here
        int n=s.length();
       HashSet<String> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            String ch=String.valueOf(s.charAt(i));
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        
        return "-1";
    }
}