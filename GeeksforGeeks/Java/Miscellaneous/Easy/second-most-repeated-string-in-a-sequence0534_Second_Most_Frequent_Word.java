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
        HashMap<String, Integer> map = new HashMap<>();
              for (int i = 0; i < arr.length; i++) {
                  map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
              }
              if(map.size()<=1)
              return -1;
              int count=0;
              for (int i = 0; i < arr.length; i++) {
                  if (map.get(arr[i]) > 1) {
                      count++;
                      if(count==2)
                      return i+1;
                  }
              }
              return -1;
    }
}