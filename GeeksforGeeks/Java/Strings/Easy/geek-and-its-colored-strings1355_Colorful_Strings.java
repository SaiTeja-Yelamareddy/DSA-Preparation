/*
 * Platform: GeeksforGeeks
 * Problem ID: geek-and-its-colored-strings1355
 * Problem: Colorful Strings
 * Problem Link: https://www.geeksforgeeks.org/problems/geek-and-its-colored-strings1355/1
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */


class Solution {
    public int countString(int n, int r, int b, int g) {
        int[][][] dp = new int[n + 1][n + 1][n + 1];

        dp[0][0][0] = 1;

        for (int total = 0; total < n; total++) {
            for (int R = 0; R <= n; R++) {
                for (int B = 0; B <= n; B++) {
                    int G = total - R - B;

                    if (G < 0 || G > n || dp[total][R][B] == 0) {
                        continue;
                    }
                    dp[total + 1][R + 1][B] += dp[total][R][B];
                    dp[total + 1][R][B + 1] += dp[total][R][B];
                    dp[total + 1][R][B] += dp[total][R][B];
                }
            }
        }

        int answer = 0;

        for (int R = r; R <= n; R++) {
            for (int B = b; B <= n; B++) {
                int G = n - R - B;

                if (G >= g) {
                    answer += dp[n][R][B];
                }
            }
        }

        return answer;
    }
}