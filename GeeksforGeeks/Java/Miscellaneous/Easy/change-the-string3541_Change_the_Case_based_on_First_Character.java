/*
 * Platform: GeeksforGeeks
 * Problem ID: change-the-string3541
 * Problem: Change the Case based on First Character
 * Problem Link: https://www.geeksforgeeks.org/problems/change-the-string3541/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    String modify(String s) {
        boolean lower=false;
        if(Character.isLower(s.charAt(0)))
        lower=true;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
           if(lower)
           {
               arr[i] = Character.toLowerCase(arr[i]);
           }
           else
           {
               arr[i] = Character.toUpperCase(arr[i]);
           }
        }
        return new String(arr);
    }
}