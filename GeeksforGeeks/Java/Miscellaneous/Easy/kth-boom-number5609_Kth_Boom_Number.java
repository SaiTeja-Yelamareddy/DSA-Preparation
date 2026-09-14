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
        int length = 1;
        while (k > (1 << length)) {
            k -= (1 << length);
            length++;
        }
        int value = k - 1;
        StringBuilder ans = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            if ((value & (1 << i)) == 0) {
                ans.append('2');
            } else {
                ans.append('3');
            }
        }

        return ans.toString();
    }
}