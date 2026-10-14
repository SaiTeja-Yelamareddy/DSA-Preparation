/*
 * Platform: CodeChef
 * Problem ID: CHEFA
 * Problem: Chef and easy problem Practice Problem in Sorting
 * Problem Link: https://www.codechef.com/practice/course/sorting-new/SORTING02/problems/CHEFA
 * Language: Java
 * Concept: Sorting
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long ans = 0;
            Arrays.sort(a);
            for (int i = n - 1; i >= 0; i -= 2) {
                ans += a[i];
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
