/*
 * Platform: CodeChef
 * Problem ID: HORSES
 * Problem: Racing Horses Practice Problem in Sorting
 * Problem Link: https://www.codechef.com/practice/course/sorting-new/SORTING01/problems/HORSES
 * Language: Java
 * Concept: Sorting
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] s = new long[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextLong();
            }
            Arrays.sort(s);
            long min = Long.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                min = Math.min(min, s[i] - s[i - 1]);
            }
            System.out.println(min);
        }
    }
}
