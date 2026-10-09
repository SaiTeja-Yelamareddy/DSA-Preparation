/*
 * Platform: CodeChef
 * Problem ID: DSCPPAS263
 * Problem: Valid Matrix Sum Practice Problem in 2D Array / Matrices
 * Problem Link: https://www.codechef.com/practice/course/matrices/MATRICES/problems/DSCPPAS263
 * Language: C++
 * Concept: Arrays
 * Status: ACCEPTED
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int total_elements = n * m;
        if (total_elements % 2 != 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}