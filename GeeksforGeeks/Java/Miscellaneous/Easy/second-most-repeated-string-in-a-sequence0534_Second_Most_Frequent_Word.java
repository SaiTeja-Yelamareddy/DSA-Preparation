/*
 * Platform: GeeksforGeeks
 * Problem ID: second-most-repeated-string-in-a-sequence0534
 * Problem: Second Most Frequent Word
 * Problem Link: https://www.geeksforgeeks.org/problems/second-most-repeated-string-in-a-sequence0534/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int secFrequent(String[] arr) {
        // code here
        if (arr.length == 0) {
                   return -1;
               }
               HashMap<String, Integer> map = new HashMap<>();
               for (int i = 0; i < arr.length; i++) {
                   map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
               }
               int first = 0;
               int second = 0;
               for (int freq : map.values()) {

                   if (freq > first) {
                       second = first;
                       first = freq;
                   } 
                   else if (freq > second && freq < first) {
                       second = freq;
                   }
               }
               return second == 0 ? -1 : second;
    }
}