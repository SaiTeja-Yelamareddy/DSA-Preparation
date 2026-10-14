/*
 * Platform: CodeChef
 * Problem ID: DSCPPAS266
 * Problem: Reduce to Single Element Array Practice Problem in Sorting
 * Problem Link: https://www.codechef.com/practice/course/sorting-new/SORTING01/problems/DSCPPAS266
 * Language: C++
 * Concept: Arrays
 * Difficulty: Medium
 * Status: ACCEPTED
 */

public static boolean canReduce(int N, int[] arr) {
        Arrays.sort(arr);
        
        for (int i = 1; i < N; i++) {
            if (arr[i] - arr[i - 1] >=2) {
                return false;
            }
        }
        return true;
    }