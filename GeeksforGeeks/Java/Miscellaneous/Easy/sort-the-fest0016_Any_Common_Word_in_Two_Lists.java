/*
 * Platform: GeeksforGeeks
 * Problem ID: sort-the-fest0016
 * Problem: Any Common Word in Two Lists
 * Problem Link: https://www.geeksforgeeks.org/problems/sort-the-fest0016/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean commonString(String[] s, String[] t) {
        // code here
        HashSet<String> set = new HashSet<>();
               for (String word : s) {
                   set.add(word);
               }
               for (String word : t) {
                   if (set.contains(word)) {
                       return true;
                   }
               }
               return false;
    }
}