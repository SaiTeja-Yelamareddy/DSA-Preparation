/*
 * Platform: CodeChef
 * Problem ID: MATZIGZAG
 * Problem: Zig-zag traversal Practice Problem in 2D Array / Matrices
 * Problem Link: https://www.codechef.com/practice/course/matrices/MATRICES/problems/MATZIGZAG
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        assert (1 <= n && n <= 100);
        assert (1 <= m && m <= 100);

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
