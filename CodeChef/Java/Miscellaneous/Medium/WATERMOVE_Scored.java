/*
 * Platform: CodeChef
 * Problem ID: WATERMOVE
 * Problem: Scored
 * Problem Link: https://www.codechef.com/START260D/problems/WATERMOVE
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
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            for (int op = 0; op < k; op++) {
                Arrays.sort(a);

                int i = 0;
                while (i < n && a[i] == 0) {
                    i++;
                }

                if (i == n) {
                    break;
                }

                int j = i + 1;
                while (j < n && a[j] == 0) {
                    j++;
                }

                if (j == n) {
                    // Only one non-zero cup remains.
                    // Move its water to an empty cup.
                    a[i] = 0;
                    a[0] = a[0] + a[i];
                    break;
                }

                a[j] += a[i];
                a[i] = 0;
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, a[i]);
            }
            System.out.println(ans);
        }
    }
}
