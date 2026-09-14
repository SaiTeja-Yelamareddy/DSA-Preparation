/*
 * Platform: GeeksforGeeks
 * Problem ID: rearrange-string-as-alternate-x-and-y-occurences3835
 * Problem: Make x times 0's and y times 1's
 * Problem Link: https://www.geeksforgeeks.org/problems/rearrange-string-as-alternate-x-and-y-occurences3835/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String arrangeString(String s, int x, int y) {
        int zero = 0;
        int one = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zero++;
            } else {
                one++;
            }
        }

        StringBuilder ans = new StringBuilder();

        while (zero > 0 && one > 0) {
            int z = Math.min(x, zero);
            for (int i = 0; i < z; i++) {
                ans.append('0');
            }
            zero -= z;
            if (zero == 0) {
                break;
            }
            int o = Math.min(y, one);
            for (int i = 0; i < o; i++) {
                ans.append('1');
            }
            one -= o;
            if (one == 0) {
                break;
            }
        }
        while (zero > 0) {
            ans.append('0');
            zero--;
        }

        while (one > 0) {
            ans.append('1');
            one--;
        }

        return ans.toString();
    }
}