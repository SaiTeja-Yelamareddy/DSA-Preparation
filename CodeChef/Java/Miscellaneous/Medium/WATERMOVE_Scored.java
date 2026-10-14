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
            int sum = Integer.MAX_VALUE;
            for (int i = 0; i < n - k; i++) {
                sum = Math.min(sum, a[i]);
            }
            System.out.println(sum);
        }

    }
}
