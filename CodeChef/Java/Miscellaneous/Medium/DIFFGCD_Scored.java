/*
 * Platform: CodeChef
 * Problem ID: DIFFGCD
 * Problem: Scored
 * Problem Link: https://www.codechef.com/START260D/problems/DIFFGCD
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 0;
            for (long i = 1; i < n; i++) {
                for (long j = i + 1; j <= n; j++) {
                    long a = i;
                    long b = j;
                    long x = a;
                    long y = b;
                    while (y != 0) {
                        long temp = y;
                        y = x % y;
                        x = temp;
                    }

                    if (x == b - a) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }

    }
}