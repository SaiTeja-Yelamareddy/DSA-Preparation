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
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            result.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (!result.contains(b[i])) {
                result.add(b[i]);
            }
        }
        Collections.sort(result);
        return result;
    }
}