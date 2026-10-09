/*
 * Platform: CodeChef
 * Problem ID: MATROTATE
 * Problem: Matrix Rotations Practice Problem in 2D Array / Matrices
 * Problem Link: https://www.codechef.com/practice/course/matrices/MATRICES/problems/MATROTATE
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

public static void rotateClockwise(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n / 2; i++) {
        int[] temp = matrix[i];
        matrix[i] =  matrix[n - i - 1];
        matrix[n - i - 1] = temp;
    }
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}