/*
 * Platform: GeeksforGeeks
 * Problem ID: union-of-two-arrays-with-distinct-elements
 * Problem: Union of Two Arrays with Distinct Elements
 * Problem Link: https://www.geeksforgeeks.org/problems/union-of-two-arrays-with-distinct-elements/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        return new ArrayList<>(set);
    }
}