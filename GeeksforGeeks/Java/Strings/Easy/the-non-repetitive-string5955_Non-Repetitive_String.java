/*
 * Platform: GeeksforGeeks
 * Problem ID: the-non-repetitive-string5955
 * Problem: Non-Repetitive String
 * Problem Link: https://www.geeksforgeeks.org/problems/the-non-repetitive-string5955/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean nonRepetitive(String s) {
        // code here
        HashSet<Character> seen = new HashSet<>();
              int left = 0;
              for (int right = 0; right < s.length(); right++) {

                  if (right > 0 && s.charAt(right) == s.charAt(right - 1)) {
                      continue;
                  } 
                  char ch = s.charAt(right);

                  if (seen.contains(ch)) {
                      return false;
                  }

                  seen.add(ch);
                  left = right;
              }

              return true;
    }
}