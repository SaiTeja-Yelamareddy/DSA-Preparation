/*
 * Platform: GeeksforGeeks
 * Problem ID: key-pair5616
 * Problem: Two Sum - Pair with Given Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/key-pair5616/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
      HashSet<Integer> set = new HashSet<>();
      for (int x : arr) {
          int needed = target - x;
          if (set.contains(needed)) {
              return true;
          }
          set.add(x);
      }
      return false;
    }
}