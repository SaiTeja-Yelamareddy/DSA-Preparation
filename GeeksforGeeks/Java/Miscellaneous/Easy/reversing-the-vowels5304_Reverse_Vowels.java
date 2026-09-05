/*
 * Platform: GeeksforGeeks
 * Problem ID: reversing-the-vowels5304
 * Problem: Reverse Vowels
 * Problem Link: https://www.geeksforgeeks.org/problems/reversing-the-vowels5304/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String modify(String s) {
        LinkedHashMap<Integer, Character> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {
                map.put(i, c);
            }
        }
        ArrayList<Character> vowels = new ArrayList<>(map.values());
        int j = vowels.size() - 1;
        char[] arr = s.toCharArray();
        for (int index : map.keySet()) {
            arr[index] = vowels.get(j);
            j--;
        }
        return new String(arr);
    }
}