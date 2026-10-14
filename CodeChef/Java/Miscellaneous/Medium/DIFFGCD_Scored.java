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

            for (long i = 1; i < n; ) {
                long q = n / i;
                long r = n / q;
                ans += (r - i + 1) * (q - 1);
                i = r + 1;
            }

            System.out.println(ans);
        }

    }
}
