/*
 * Platform: GeeksforGeeks
 * Problem ID: first-repeating-element4018
 * Problem: First Repeating Element
 * Problem Link: https://www.geeksforgeeks.org/problems/first-repeating-element4018/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int firstRepeated(int[] arr) {
        // code here
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
          for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
          for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1) {
                return i + 1;
                }
            }
         return -1;
    }
}
