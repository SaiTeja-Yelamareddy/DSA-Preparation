/*
 * Platform: GeeksforGeeks
 * Problem ID: the-penalty-shootout3810
 * Problem: Successful Penalty Conversions
 * Problem Link: https://www.geeksforgeeks.org/problems/the-penalty-shootout3810/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int countCoversions(String s) {
        // code here
       int count = 0;
              for (int i = 0; i < s.length() - 1; i++) {
                  if (s.charAt(i) == '2' && s.charAt(i + 1) == '1') {
                      count++;
                  }
              }
              return count; 
    }
}