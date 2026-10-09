/*
 * Platform: CodeChef
 * Problem ID: REMOVEDUPLIC
 * Problem: Remove Duplicates from Sorted Array Practice Problem in Intermediate Arrays and 2D Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-intermediate/ARRAYSP04/problems/REMOVEDUPLIC
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
