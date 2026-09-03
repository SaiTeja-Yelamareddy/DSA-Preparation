/*
 * Platform: HackerRank
 * Problem ID: pangrams
 * Problem: Solution
 * Problem Link: https://www.hackerrank.com/challenges/pangrams/problem
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Tags: Algorithms, Strings
 * Status: ACCEPTED
 */


    public static String pangrams(String s) {
    // Write your code here
     if(s.length()<26)
                 return "not pangram";
                s=s.toLowerCase();
                int[] freq=new int[26];
                for(int i=0;i<s.length();i++)
                {
                    char ch=s.charAt(i);
