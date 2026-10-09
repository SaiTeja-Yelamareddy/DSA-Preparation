/*
 * Platform: CodeChef
 * Problem ID: LASTZERO
 * Problem: Move all the zeros to the last Practice Problem in Intermediate Arrays and 2D Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-intermediate/ARRAYSP04/problems/LASTZERO
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}