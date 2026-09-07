/*
 * Platform: GeeksforGeeks
 * Problem ID: repeated-character2058
 * Problem: Repeated Character
 * Problem Link: https://www.geeksforgeeks.org/problems/repeated-character2058/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    char firstRep(String S) {
        // your code here
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
                for (int i = 0; i < S.length(); i++) {
                    char ch = S.charAt(i);
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