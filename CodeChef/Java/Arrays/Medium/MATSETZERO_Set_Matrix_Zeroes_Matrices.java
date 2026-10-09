/*
 * Platform: CodeChef
 * Problem ID: MATSETZERO
 * Problem: Set Matrix Zeroes Practice Problem in 2D Array / Matrices
 * Problem Link: https://www.codechef.com/practice/course/matrices/MATRICES/problems/MATSETZERO
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

 public static void setZeroes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        boolean firstColZero = false;
        for (int i = 0; i < rows; i++) {
            if (mat[i][0] == 0) firstColZero = true;
            for (int j = 1; j < cols; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0; 
                    mat[0][j] = 0;
                }
            }
        }
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
            if (firstColZero) {
                mat[i][0] = 0;
            }
        }
    }