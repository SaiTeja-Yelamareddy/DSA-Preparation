/*
 * Platform: GeeksforGeeks
 * Problem ID: non-repeating-character-1587115620
 * Problem: Non Repeating Character
 * Problem Link: https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }
}
