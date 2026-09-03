/*
 * Platform: GeeksforGeeks
 * Problem ID: pangram-checking-1587115620
 * Problem: Panagram Checking
 * Problem Link: https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public static boolean checkPangram(String s) {
        // code here
        if(s.length()<26)
                return false;
                s=s.toLowerCase();
                int[] freq=new int[26];
                for(int i=0;i<s.length();i++)
                {
                    char ch=s.charAt(i);
                    freq[ch-'a']++;
                }
                for(int i=0;i<26;i++)
                {
                    if(freq[i]==0)
                    {
                        return false;
                    }
                }
                return true;
    }
}