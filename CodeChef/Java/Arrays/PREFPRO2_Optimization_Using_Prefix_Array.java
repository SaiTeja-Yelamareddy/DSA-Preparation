/*
 * Platform: CodeChef
 * Problem ID: PREFPRO2
 * Problem: Optimization Using Prefix Array Practice Problem in Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-new/ARRAYSP03/problems/PREFPRO2
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

import java.util.Scanner;
import java.util.Vector;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N + 1];
        int[] prefix = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }

        prefix[0] = 0;

        for(int i = 1; i <= N; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }

        int K = sc.nextInt();

        for(int i = 0; i < K; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = prefix[b] - prefix[a - 1];
            System.out.println(sum);
        }
    }
}
