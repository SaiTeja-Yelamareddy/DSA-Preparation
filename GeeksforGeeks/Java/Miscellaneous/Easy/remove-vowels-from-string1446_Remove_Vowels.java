/*
 * Platform: GeeksforGeeks
 * Problem ID: remove-vowels-from-string1446
 * Problem: Remove Vowels
 * Problem Link: https://www.geeksforgeeks.org/problems/remove-vowels-from-string1446/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    String removeVowels(String s) {
        // code here
        char[] arr = s.toCharArray();
        char[] srr = new char[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||
               arr[i] == 'o' || arr[i] == 'u')
            {
                continue;
            }
            srr[j] = arr[i];
            j++;
        }
        return new String(srr);
    }
}