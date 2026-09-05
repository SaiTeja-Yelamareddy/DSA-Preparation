/*
 * Platform: Code360
 * Problem ID: 1231000
 * Problem: Reverse vowels in a string
 * Problem Link: https://www.naukri.com/code360/problems/reverse-vowels-in-a-string_1231000
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.* ;
import java.io.*; 
public class Solution {
    public static String reverseVowels(String s){
        // Write your code here.
        LinkedHashMap<Integer, Character> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u'||
                 c == 'A' || c == 'E' || c == 'I' ||
                 c == 'O' || c == 'U') {
                map.put(i, c);
            }
        }
        ArrayList<Character> vowels = new ArrayList<>(map.values());
        int j = vowels.size() - 1;
        char[] arr = s.toCharArray();
        for (int index : map.keySet()) {
            arr[index] = vowels.get(j);
            j--;
        }

        return new String(arr);
    }
}
