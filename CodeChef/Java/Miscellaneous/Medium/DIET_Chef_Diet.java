/*
 * Platform: CodeChef
 * Problem ID: DIET
 * Problem: Chef Diet Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/DIET
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int protein = 0;
            int failedDay = -1;
            for (int i = 1; i <= N; i++) {
                int A = sc.nextInt();
                if (failedDay == -1) {
                    protein += A;
                    if (protein < K) {
                        failedDay = i;
                    } else {
                        protein -= K;
                    }
                }
            }
            if (failedDay == -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO " + failedDay);
            }
        }
        sc.close();
    }
}
