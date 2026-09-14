/*
 * Platform: GeeksforGeeks
 * Problem ID: kth-boom-number5609
 * Problem: Kth Boom Number
 * Problem Link: https://www.geeksforgeeks.org/problems/kth-boom-number5609/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String boomNumber(int k) {
        StringBuilder ans = new StringBuilder();
        int length = 1;
        while (k > (1 << length)) {
            k -= (1 << length);
            length++;
        }
        String binary = Integer.toBinaryString(k);
        for (int i = 1; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                ans.append('2');
            } else {
                ans.append('3');
            }
        }
        while (ans.length() < length) {
            ans.insert(0, '2');
        }

        return ans.toString();
    }
}