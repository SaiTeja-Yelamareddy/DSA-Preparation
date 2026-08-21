/*
 * Platform: CodeChef
 * Problem ID: MAXCOUNT
 * Problem: Count of Maximum Practice Problem in Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-new/ARRAYSP02/problems/MAXCOUNT
 * Language: Java
 * Concept: Arrays
 * Difficulty: Medium
 * Status: ACCEPTED
 */

class Solution {
    public int[] mostFrequent(int N, int[] A) {
        //write your code  here
         HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {

            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        int max = 0;
        int answer = Integer.MAX_VALUE;
        for(int value : map.keySet()) {
            int count = map.get(value);
            if(count > max) {
                max = count;
                answer = value;
            }
            else if(count == max && value < answer) {
                answer = value;
            }
        }
        return new int[]{answer, max};
    }
}