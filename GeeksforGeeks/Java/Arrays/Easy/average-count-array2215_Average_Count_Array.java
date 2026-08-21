/*
 * Platform: GeeksforGeeks
 * Problem ID: average-count-array2215
 * Problem: Average Count Array
 * Problem Link: https://www.geeksforgeeks.org/problems/average-count-array2215/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int[] countArray(int[] arr, int x) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            int avg = (arr[i] + x) / 2;

            result[i] = map.getOrDefault(avg, 0);
        }

        return result;
    }
}
