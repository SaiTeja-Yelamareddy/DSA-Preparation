/*
 * Platform: GeeksforGeeks
 * Problem ID: for-loop-2
 * Problem: Even Positioned Characters
 * Problem Link: https://www.geeksforgeeks.org/problems/for-loop-2/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public static void utility(String s) {
        // code here
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                char ch=s.charAt(i);
                System.out.print(ch+" ");
            }
        }
    }
}