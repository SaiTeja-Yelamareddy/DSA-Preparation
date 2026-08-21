/*
 * Platform: CodeChef
 * Problem ID: CHEFSUM
 * Problem: Little Chef and Sums Practice Problem in Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-new/ARRAYSP03/problems/CHEFSUM
 * Language: Java
 * Concept: Arrays
 * Difficulty: Medium
 * Status: TIME_LIMIT_EXCEEDED
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int min = A[0];
            int answer = 1;
            for(int i = 1; i < N; i++) {
                if(A[i] < min) {
                    min = A[i];
                    answer = i + 1;
                }
            }
            System.out.println(answer);
        }
    }
}
