/*
 * Platform: Code360
 * Problem ID: 983606
 * Problem: First Unique Character in a String
 * Problem Link: https://www.naukri.com/code360/problems/first-unique-character-in-a-string_983606
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.* ;
import java.io.*; 
public class Solution {
	public static char firstNonRepeating(String str) {
		// Write your code here
		HashMap<Character, ArrayList<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < S.length(); i++) {
             char ch = S.charAt(i);
            if (!map.containsKey(ch))
			  map.put(ch, new ArrayList<>());
             map.get(ch).add(i);
         }
         for (int i = 0; i < S.length(); i++) {
			    char ch = S.charAt(i);
                if (map.get(ch).size() == 1) {
                 return i;
                 }
         }
         return -1; 
	}
}
