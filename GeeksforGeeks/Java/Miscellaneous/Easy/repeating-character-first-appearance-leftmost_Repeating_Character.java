/*
 * Platform: GeeksforGeeks
 * Problem ID: repeating-character-first-appearance-leftmost
 * Problem: Repeating Character
 * Problem Link: https://www.geeksforgeeks.org/problems/repeating-character-first-appearance-leftmost/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    static int repeatedCharacter(String S) {
        // code here
            HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
             for (int i = 0; i < S.length(); i++) {
                 char ch = S.charAt(i);
                if (!map.containsKey(ch))
                map.put(ch, new ArrayList<>());
                 map.get(ch).add(i);
             }
             for (int i = 0; i < S.length(); i++) {
                 char ch = S.charAt(i);
                 if (map.get(ch).size() > 1) {
                     return i;
                 }
             }
             return -1;   
    }
}