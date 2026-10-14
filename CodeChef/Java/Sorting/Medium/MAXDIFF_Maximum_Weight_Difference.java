/*
 * Platform: CodeChef
 * Problem ID: MAXDIFF
 * Problem: Maximum Weight Difference Practice Problem in Sorting
 * Problem Link: https://www.codechef.com/practice/course/sorting-new/SORTING02/problems/MAXDIFF
 * Language: Java
 * Concept: Sorting
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] w = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt();
                total += w[i];
            }
            Arrays.sort(w);
            int sumK = 0;
            int sumNminusK = 0;
            for (int i = 0; i < k; i++) {
                sumK += w[i];
            }
            for (int i = 0; i < n - k; i++) {
                sumNminusK += w[i];
            }
            int chef1 = total - sumK;
            int diff1 = chef1 - sumK;
            int chef2 = total - sumNminusK;
            int diff2 = chef2 - sumNminusK;
            System.out.println(Math.max(diff1, diff2));
        }
    }
}