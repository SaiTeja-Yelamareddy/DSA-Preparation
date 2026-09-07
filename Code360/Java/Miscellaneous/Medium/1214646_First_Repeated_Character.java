/*
 * Platform: Code360
 * Problem ID: 1214646
 * Problem: First Repeated Character
 * Problem Link: https://www.naukri.com/code360/problems/first-repeated-character_1214646
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

public class Solution {
    public static char repeatedCharacter(String str){
        // Write your code here.
         HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) > 1) {
                return ch;
            }
        }
        return '%';
    }
}