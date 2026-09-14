/*
 * Platform: GeeksforGeeks
 * Problem ID: make-palindrome--170647
 * Problem: Make Palindrome
 * Problem Link: https://www.geeksforgeeks.org/problems/make-palindrome--170647/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean makePalindrome(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int odd = 0;
        for (String s : map.keySet()) {
            String reverse = new StringBuilder(s).reverse().toString();
            if (s.equals(reverse)) {
                if (map.get(s) % 2 == 1) {
                    odd++;
                }
            }
            else {
                if (!map.containsKey(reverse) ||
                    map.get(s) != map.get(reverse)) {
                    return false;
                }
            }
        }
        return odd <= 1;
    }
}
