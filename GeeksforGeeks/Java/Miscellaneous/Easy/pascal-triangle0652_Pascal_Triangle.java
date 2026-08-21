/*
 * Platform: GeeksforGeeks
 * Problem ID: pascal-triangle0652
 * Problem: Pascal Triangle
 * Problem Link: https://www.geeksforgeeks.org/problems/pascal-triangle0652/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i < n; i++) {

            ArrayList<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for (int j = 0; j < row.size() - 1; j++) {
                int sum = row.get(j) + row.get(j + 1);
                newRow.add(sum);
            }

            newRow.add(1);
            row = newRow;
        }
        return row;
    }
}