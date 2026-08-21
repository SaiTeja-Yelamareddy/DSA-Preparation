/*
 * Platform: GeeksforGeeks
 * Problem ID: sum-array-puzzle
 * Problem: Sum Array Puzzle
 * Problem Link: https://www.geeksforgeeks.org/problems/sum-array-puzzle/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public void sumArray(int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sum-arr[i];
        }
    }
}