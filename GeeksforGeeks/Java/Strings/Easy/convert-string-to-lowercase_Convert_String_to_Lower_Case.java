/*
 * Platform: GeeksforGeeks
 * Problem ID: convert-string-to-lowercase
 * Problem: Convert String to Lower Case
 * Problem Link: https://www.geeksforgeeks.org/problems/convert-string-to-lowercase/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    static String toLower(String s) {
        // code here
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++)
         {
            if(arr[i] >= 'A' && arr[i] <= 'Z')
                {
                    arr[i] = (char)(arr[i] + 32);
                }
            }
           return new String(arr);
    }
}