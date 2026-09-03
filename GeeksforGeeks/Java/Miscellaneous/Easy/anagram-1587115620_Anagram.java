/*
 * Platform: GeeksforGeeks
 * Problem ID: anagram-1587115620
 * Problem: Anagram
 * Problem Link: https://www.geeksforgeeks.org/problems/anagram-1587115620/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int m=s1.length(),n=s2.length();
        if(m!=n)
        {
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<m;i++)
        {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            return false;
        }
        return true;
    }
}