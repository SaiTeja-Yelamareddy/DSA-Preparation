/*
 * Platform: GeeksforGeeks
 * Problem ID: union-of-two-sorted-arrays-1587115621
 * Problem: Union of 2 Sorted Arrays
 * Problem Link: https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public ArrayList<Integer> findUnion(int[] a, int[] b) {

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                add(result, a[i]);
                i++;
            }
            else if (b[j] < a[i]) {
                add(result, b[j]);
                j++;
            }
            else {
                add(result, a[i]);
                i++;
                j++;
            }
        }
        while (i < a.length) {
            add(result, a[i]);
            i++;
        }
        while (j < b.length) {
            add(result, b[j]);
            j++;
        }
        return result;
    }
    static void add(ArrayList<Integer> result, int value) {
        if (result.size() == 0 || result.get(result.size() - 1) != value) {
            result.add(value);
        }
    }
}